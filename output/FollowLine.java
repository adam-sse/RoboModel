import lejos.hardware.*;
import lejos.hardware.motor.*;
import lejos.hardware.sensor.*;
import lejos.utility.*;
import lejos.robotics.*;
import java.util.*;

public class FollowLine implements RegulatedMotorListener {

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
		
		/* set i = 0.0*/
		variables.put("i", (double) (0.0));
		
		/* set STEP = 5.0*/
		variables.put("STEP", (double) (5.0));
		
		/* set turn = getOrDeafult(variables, "STEP")*/
		variables.put("turn", (double) (getOrDeafult(variables, "STEP")));
		
		/* set THRESHOLD = 0.2*/
		variables.put("THRESHOLD", (double) (0.2));
		
		/* while (getOrDeafult(variables, "i")) < (1000.0) */
		while ((getOrDeafult(variables, "i")) < (1000.0)) {
			/* if (readSensor(light)) <= (getOrDeafult(variables, "THRESHOLD")) */
			if ((readSensor(light)) <= (getOrDeafult(variables, "THRESHOLD"))) {
				/* set turn = getOrDeafult(variables, "STEP")*/
				variables.put("turn", (double) (getOrDeafult(variables, "STEP")));
				
				/* drive until (readSensor(light)) > (getOrDeafult(variables, "THRESHOLD")); */
				right.startSynchronization();
				right.backward();
				left.backward();
				right.endSynchronization();
				while (!((readSensor(light)) > (getOrDeafult(variables, "THRESHOLD")))) {
					Delay.msDelay(50);
				}
				right.startSynchronization();
				right.stop();
				left.stop();
				right.endSynchronization();
				
			}
			
			/* if (readSensor(light)) > (getOrDeafult(variables, "THRESHOLD")) */
			if ((readSensor(light)) > (getOrDeafult(variables, "THRESHOLD"))) {
				/* turn right -(getOrDeafult(variables, "turn")); */
				right.startSynchronization();
				right.rotate((int) -(-(-(getOrDeafult(variables, "turn")))));
				left.rotate((int) (-(-(getOrDeafult(variables, "turn")))));
				right.endSynchronization();
				waitUntilDone();
				
				/* set turn = - ((1.0) * (getOrDeafult(variables, "turn")))*/
				variables.put("turn", (double) (- ((1.0) * (getOrDeafult(variables, "turn")))));
				
				/* if (getOrDeafult(variables, "turn")) > (0.0) */
				if ((getOrDeafult(variables, "turn")) > (0.0)) {
					/* set turn = (getOrDeafult(variables, "turn")) + (getOrDeafult(variables, "STEP"))*/
					variables.put("turn", (double) ((getOrDeafult(variables, "turn")) + (getOrDeafult(variables, "STEP"))));
					
				}
				
				/* if (getOrDeafult(variables, "turn")) < (0.0) */
				if ((getOrDeafult(variables, "turn")) < (0.0)) {
					/* set turn = (getOrDeafult(variables, "turn")) - (getOrDeafult(variables, "STEP"))*/
					variables.put("turn", (double) ((getOrDeafult(variables, "turn")) - (getOrDeafult(variables, "STEP"))));
					
				}
				
			}
			
			/* set i = (getOrDeafult(variables, "i")) + (1.0)*/
			variables.put("i", (double) ((getOrDeafult(variables, "i")) + (1.0)));
			
		}
		
		
		sensor0.close();
		left.close();
		right.close();
	}
	
	public static void main(String[] args) {
		new FollowLine().run();
	}
	
}
