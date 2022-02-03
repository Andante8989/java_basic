package string2;

import java.util.Scanner;

public class String05P399 {

	public static void main(String[] args) {
		// .length()와 charAt()을 활용해 입력된 전체 문자열을
		// 한글자씩 한 줄 씩 처리하는 로직을 작성해주세요.
		
		// 문자열은 Scanner로 입력받습니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		String cha = scan.nextLine();
		int count = 0;
		
		for (int a = 0; a < cha.length(); a++) {
			System.out.println(cha.charAt(count));
			count++;
		}
	}
}
