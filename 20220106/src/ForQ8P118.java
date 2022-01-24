
public class ForQ8P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요
		//     *
		//    **
		//   ***
		//  ****

		for (int a = 0; a < 4; a++) {
			for (int b = 0; b < 3-a; b++) {
				System.out.print(" ");
			}
		    for (int c = 0; c < a+1; c++) {
			    System.out.print("*");
			}
		    System.out.println();
		}	
	}
}
