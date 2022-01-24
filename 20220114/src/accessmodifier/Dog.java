package accessmodifier;

public class Dog { // 정의부
	// 강아지의 정보를 자율적으로 3개 부여해주세요
	// String name은 고정입니다.
	
	private String name; 
	private String noise;
	private String color;
	private int age;
	
	// 생성자로 강아지 정보를 처리하시되
	// 이름은 무조건 입력받게 해 주세요
	public Dog (String n) {
		name = n;
		noise = "왈왈";
		color = "검은색";
		age = 2;
	}
	
	// 수치 정보값이 변경되는 형태의 메서드 하나를 만들어주세요.
	public void year() {
		age += 1;
		System.out.println("1년이지나" + age + " 살이 되었습니다.");
	}
}
