import java.util.Scanner;

public class ForQ5P118 {

	public static void main(String[] args) {
		// Scanner로 정수를 입력받게 해 주세요.
		// 입력받은 정수의 제곱 형태로 정사각형이 찍히도록
		// 중첩 반복문을 작성해주세요
		// ex) 3 입력시
		// ***
		// ***
		// ***
		// 위와 같이 3 * 3 형태로 출력
		// 가로줄을 출력할때는 System.out.print("*");를
		// 다음줄로 커서를 내릴때만 System.out.println();를 씁니다
		
		Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    
	    for (int b = 0; b < a; b++) {
	    	
	    	for (int c = 0; c < a; c++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
    }
}
