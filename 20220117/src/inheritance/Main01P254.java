package inheritance;

public class Main01P254 {

	public static void main(String[] args) {
		// Student가 Person을 상속했기 때문에
		// Student는 Person의 자원을 사용할 수 있습니다.
		Student s1 = new Student();
		s1.name = "이충현";
		s1.age = 20;
		s1.stuNum = 15;
		
		s1.getInfo();
		s1.getStuInfo();
		
		// Student를 하나 더 만들어주시고
		// 코드는 복붙해서 보내주시고
		// 메모리구조는 그림으로 그려서 캡처해서 보내주세요.
		
		Student s2 = new Student();
		s2.name = "홍길동";
		s2.age = 100;
		s2.stuNum = 15;
		
		s2.getInfo();
		s2.getStuInfo();
		

	}

}
