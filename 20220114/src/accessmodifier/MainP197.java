package accessmodifier;

public class MainP197 {

	public static void main(String[] args) {
		// 전사를 하나 만들고 사냥을 3번 해주세요
		
		Warrior w1 = new Warrior("baba");
		// public 요소는 외부지역에서 마음대로 값을 변경할 수 있음.
		// private 요소는 외부지역에서는 절대로 값을 조회하거나 변경할수없음.
		// w1.hp = 100;)
		w1.hunt();
		w1.hunt();
		w1.hunt();

		
		Dog d1 = new Dog("하늘");
		
		d1.year();
		d1.year();
		d1.year();
	}

}
