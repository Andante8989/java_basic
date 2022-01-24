package polymorphism;

public class Barista extends Person {
	
	private boolean license;

	public Barista(String name, int age, boolean license) {
		super(name, age);
		this.license = true;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("자격증 유무 : " + license);
	}
	
	public void showBarista() {
		System.out.println("저는 바리스타 입니다.");
	}

}
