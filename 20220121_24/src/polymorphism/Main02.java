package polymorphism;

public class Main02 {

	public static void main(String[] args) {
		Person p1 = new Person("고양이", 5);
		Person c1 = new Chef("인절미", 20, "파스타");
		Person b1 = new Barista("홍길동", 35, true);
		
		p1.showPerson();
		System.out.println("-------------------");
		c1.showPerson();
		System.out.println("-------------------");
		b1.showPerson();
		
		// c1.showChef();  이것은 Person소속이 아니라 Chef소속이므로 출력이 안됨 
		// 출력을 원할시 위의 Person c1 을 Chef c1으로 변경해줘야됨
		

	}

}
