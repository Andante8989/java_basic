package polymorphism;

public class Chef extends Person {
	
	private String cook;

	public Chef(String name, int age, String cook) {
		super(name, age);
		this.cook = cook;
	}
	
	public void showPerson () {
		super.showPerson();
		System.out.println("오늘의 요리 : " + cook);
	}
	
	public void showChef() {
		System.out.println("저는 요리사입니다.");
	}

}
