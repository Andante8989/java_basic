package static1;

public class Main02P276 {

	public static void main(String[] args) {
		// static 요소는 생성 없이도 활용할 수 있다.
		// 클래스명.변수명 으로 정적변수를 마음대로 호출 가능합니다.
		System.out.println(StaticTest.num2); // static이 들어갓던 num2은 호출이 됨
        // System.out.println(StaticTest.num1); // static이 없으므로 num1은 호출이 안됨
		StaticTest.check();
		
		// s1을 생성한 후 s1.check();
		// 를 호출해보세요.
		
		StaticTest s1 = new StaticTest();
		s1.check();

	}

}
