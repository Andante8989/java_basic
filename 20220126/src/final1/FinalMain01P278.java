package final1;

public class FinalMain01P278 {

	public static void main(String[] args) {
		// Final은 자료형 왼쪽에 final키워드를 붙여서 사용합니다,
		final int a = 50;
		// 변경할 목적이 아니라면 조회는 제약이 없습니다.
		System.out.println(a);
		// 값을 변경하려고 하면 에러가 납니다.
		// a = 500;
		
		// 현재 자바에서는 상수변수는 선언과 동시에 초기화를 하지 않아도 되지만
		// 예전버전이나 c++등의 언어에서는
		// 선언하고 값을 집어넣지 않으면 값이 비어있는 채로 박제가 되었습니다,
		// 따라서 사용시 되도록이면 선언과 동시에 초기화도 시켜야 합니다.
		
		final int b;
		b = 60;
		System.out.println(b);  // 이런식으로 가능하다! 하지만 7번구문처럼 선언과 동시에 초기화해주는게 합리적.
		

	}

}
