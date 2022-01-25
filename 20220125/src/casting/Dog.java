package casting;

public class Dog extends Animal {

	public Dog(String name, int age) {
		super(name, age);	
	}
	
	public void noise() {
		System.out.println("왕왕 짖습니다");
	}
	
	public void sit() {
		System.out.println("강아지가 앉습니다.");
	}

}
