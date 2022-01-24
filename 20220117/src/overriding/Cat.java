package overriding;

public class Cat extends Animal {
	
	
	public String color;
	
	
	public void getInfo () {
		System.out.println("이름 : " + name + ", 색 : " + color + ", 나이 : " 
	                        + age + ", 성별 : " + gender);
	}
	public void howl () { 
		System.out.println("야옹");
	}
}
