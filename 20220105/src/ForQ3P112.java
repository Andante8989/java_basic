import java.util.Scanner;

public class ForQ3P112 {

	public static void main(String[] args) {
		// 구구단을 작성해보겠습니다.
		// Scanner를 이용해서 int dan에 정수를 받아주세요.
		// dan에 값을 받으면
		// dan * 1 부터 dan * 9 까지 순차적으로 콘솔창에 찍히게 만들어주세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇 단을 보고 싶으신가요?");
		int dan = scan.nextInt();  // 구구단이기 떄문에 dan은 입력하면 고정값이 되는걸 생각해야된다
		
		for (int a = 1; a < 10; a++) { // 범위설정할때 문제 보고 생각할것
			
			System.out.println(dan + " * " + a + " = " + dan*a);
			
			
		}
    
	}

}
