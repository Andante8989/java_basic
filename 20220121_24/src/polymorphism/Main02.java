package polymorphism;

public class Main02 {

	public static void main(String[] args) {
		Person p1 = new Person("고양이", 5);
		Chef c1 = new Chef("인절미", 20, "파스타");
		Person b1 = new Barista("홍길동", 35, true);
		
		p1.showPerson();
		System.out.println("-------------------");
		c1.showPerson();
		System.out.println("-------------------");
		b1.showPerson();
		
		c1.showChef();
		

	}

}
