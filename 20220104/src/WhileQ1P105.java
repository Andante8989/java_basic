import java.util.Scanner;

public class WhileQ1P105 {

	public static void main(String[] args) {
		// 스캐너를 이용해서 String num 변수에
		// "문자열 형태인 숫자"를 입력받게 해 주세요. (scan.nextLine()으로 문자열 입력받기)
		// 이 문자자료 num을 int loop 변수에 Integer.parseInt()로 정수변환해 저장하세요.
		// loop 변수에 입력된 정수 횟수만큼
		// "반복문을 실행합니다." 라는 문장이 콘솔에 출력되도록
		// while문을 작성해주세요.
	
		Scanner scan = new Scanner(System.in);  //스캐너 입력
		System.out.println("숫자를 입력해주세요.");  // 숫자를 입력해주세요 콘솔 띄우기
		String num = scan.nextLine();    // num 을 콘솔에 입력하게 해주고 문자열로 바꿈
		
		int loop = Integer.parseInt(num);  // num변수에 저장된 문자열을 정수로 변경해 loop변수에 저장
		int a = 0; // 몇바퀴 돌고 있는지 체크해주는 변수 (0으로 시작후 한 바퀴마다 1씩 증가)
		while (a < loop) {   //조건부 서식
			a++; // 매번 1을 더하고 값을 저장
			System.out.println("반복문을 실행합니다. " + a); 
		}
		
      scan.close();
	}

}
