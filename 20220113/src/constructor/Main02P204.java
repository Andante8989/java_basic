package constructor;

public class Main02P204 {

	public static void main(String[] args) {
		// 농구선수를 생성해주세요.
		
		BasketballPlayer b1 = new BasketballPlayer(120, 130);
		
		b1.dunkShoot();

		BasketballPlayer b3 = new BasketballPlayer(200, 150);
		
		b3.dunkShoot();
	}

}
