package game.polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		// Warrior하나, Orc하나를 생성해주세요
		Warrior w1 = new Warrior("홍길동");
		Wolf wo1 = new Wolf();
		Slime s1 = new Slime();
		Orc o1 = new Orc();
		
		// 교전
		w1.hunt(o1);
		System.out.println("---------------------");
		w1.hunt(o1);
		System.out.println("---------------------");
		w1.hunt(s1);
		System.out.println("---------------------");
		w1.hunt(s1);
		System.out.println("---------------------");
		w1.hunt(wo1);
		
		

	}

}
