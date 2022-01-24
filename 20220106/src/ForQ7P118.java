
public class ForQ7P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요
		// ****
		// ***
		// **
		// *
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요
		
		for (int a = 0; a < 4; a++) {    // a-- 이렇게 감소하는계산으로 진행해도 가능하다
			                             // 단 a > 0 으로 범위를 바꾸고 int a = 4로 바꿔야된다
			for (int b = 0; b < 4-a; b++) { 
				System.out.print("*");
			}
			System.out.println();
     	}
	}
}
