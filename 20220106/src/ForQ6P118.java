
public class ForQ6P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을수 있도록 중첩 반복문을 사용해 코드를 작성해주세요.
		// *
		// **
		// ***
		// ****
		// 중첩 반복문의 어느 지점이 다음줄로 내리고, 어느 부분이 별을 나열하는지 생각해보세요.
		
		for (int a = 1; a < 5; a++) {
			for (int b = 0; b < a ; b++) {
				System.out.print("*");
	 	 }
	    System.out.println();
	  }
   }
}
