import lejos.hardware.*;
import lejos.hardware.motor.*;
import lejos.hardware.sensor.*;
import lejos.utility.*;
import lejos.robotics.*;
import java.util.*;

public class DriveTest implements RegulatedMotorListener {

	private volatile boolean turning = false;
	
	public void rotationStarted(RegulatedMotor motor, int tachoCount, boolean stalled, long timeStamp) {
		synchronized (this) {
			turning = true;
		}
	}
	
	public void rotationStopped(RegulatedMotor motor, int tachoCount, boolean stalled, long timeStamp) {
		synchronized (this) {
			turning = false;
			notifyAll();
		}
	}
	
	private void waitUntilDone() {
		synchronized (this) {
			while (turning) {
				try {
					wait();
				} catch (InterruptedException e) {
				}
			}
		}
	}
	
	private float readSensor(SensorMode mode) {
		float[] sample = new float[mode.sampleSize()];
		mode.fetchSample(sample, 0);
		return sample[0];
	}
	
	private double getOrDeafult(Map<String, Double> map, String variable) {
		Double result = map.get(variable);
		if (result == null) {
			result = 0.0;
		}
		return result;
	}
	
	public void run() {
		Brick ev3 = BrickFinder.getDefault();
		
		RegulatedMotor left = new EV3LargeRegulatedMotor(ev3.getPort("C"));
		RegulatedMotor right = new EV3LargeRegulatedMotor(ev3.getPort("B"));
		right.synchronizeWith(new RegulatedMotor[] { left });
		right.setSpeed((int) 50.0);
		left.setSpeed((int) 50.0);
		right.addListener(this);
		
		EV3ColorSensor sensor0 = new EV3ColorSensor(ev3.getPort("S3"));
		SensorMode light = sensor0.getRedMode();
		
		Map<String, Double> variables = new HashMap<>();
		
		/* drive 120.0; */
		right.startSynchronization();
		right.rotate((int) (-(120.0)));
		left.rotate((int) (-(120.0)));
		right.endSynchronization();
		waitUntilDone();
		
		/* turn right -(90.0); */
		right.startSynchronization();
		right.rotate((int) -(-(-(90.0))));
		left.rotate((int) (-(-(90.0))));
		right.endSynchronization();
		waitUntilDone();
		
		/* turn right 90.0; */
		right.startSynchronization();
		right.rotate((int) -(-(90.0)));
		left.rotate((int) (-(90.0)));
		right.endSynchronization();
		waitUntilDone();
		
		/* drive -(120.0); */
		right.startSynchronization();
		right.rotate((int) (-(-(120.0))));
		left.rotate((int) (-(-(120.0))));
		right.endSynchronization();
		waitUntilDone();
		
		
		sensor0.close();
		left.close();
		right.close();
	}
	
	public static void main(String[] args) {
		new DriveTest().run();
	}
	
}
