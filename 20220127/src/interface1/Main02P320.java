package interface1;

public class Main02P320 {

	public static void main(String[] args) {
		Vehiclee t1 = new Train();
		t1.accel();
		t1.showStatus();
		t1.accel();
		t1.showStatus();
		t1.breakSpeed();
		t1.showStatus();
		t1.reFuel();
		t1.showStatus();
	}

}
