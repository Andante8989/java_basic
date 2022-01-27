package interface1;

public class Train implements Vehiclee{
	private int speed;
	private int elec;
	
	public Train() {
		this.speed = MIN_SPEED;
		this.elec = MAX_ELEC;
		
		
	}

	@Override
	public void accel() {
		if (speed + INCREASE_SPEED > MAX_SPEED) {
			speed = MAX_SPEED;
		} else {
			speed += INCREASE_SPEED;
		}
		elec -= USE_ELEC;
	}

	@Override
	public void breakSpeed() {
		if (speed - DECREASE_SPEED < MIN_SPEED) {
			speed = MIN_SPEED;
		} else {
			speed -= DECREASE_SPEED;
		}
		
	}

	@Override
	public void reFuel() {
		if (elec + CHARGE > MAX_ELEC) {
			elec = MAX_ELEC;
		} else {
			elec += CHARGE;
		}
		
	}

	@Override
	public void showStatus() {
		System.out.println("기차의 속도 : " + speed + ", 기차의 연료 : " + elec);
		
	}

}
