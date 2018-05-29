setup {
	Right: {
		port: B
		type: Large
		speed: 50
		reverse: true
	}
	
	Left: {
		port: C
		type: Large
		speed: 50
		reverse: true
	}
	
	Sensor: {
		port: S3
		type: ColorSensor
		mode: RedMode
		name: light
	}
}

program DriveTest {

	forward 120;
	left 90;
	right 90;
	backward 120;

}

program FollowLine {
    set i = 0;
    set STEP = 5;
    set turn = STEP;
    set THRESHOLD = 0.2;

    while (i < 1000) {
        if (light <= THRESHOLD) {
            set turn = STEP;
            forward until light > THRESHOLD;
            
        }
        
        if (light > THRESHOLD) {
            left turn;
                        
            set turn = -1 * turn;
            if (turn > 0) {
                set turn = turn + STEP;
            }
            if (turn < 0) {
                set turn = turn - STEP;
            }
        }
        
        set i = i + 1;
    }
}
