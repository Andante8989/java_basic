package system1;

import java.util.Scanner;

public class TimeCheck02P384 {

	public static void main(String[] args) {
		// try ~ catch구문의 소요시간을 구해주세요.
		// 내부에는 여러분들이 원하는 속성의 예외를 발생시키세요
		// throw로 발생시키면 됩니다
		Scanner scan = new Scanner(System.in);
		System.out.println("배열에서 몇 번째 자리를 찾고싶은가요?");
		int i = scan.nextInt();
		long start = System.currentTimeMillis();
		System.out.println("시작시간 : " + start);
		
		int[] arr = {46, 59, 51, 69, 84, 97};
		System.out.println(arr[i]);
		try { 
			if (i > 5) {
			throw new ArrayIndexOutOfBoundsException();
			} else {
				System.out.println("정상 범위내에서 찾았습니다.");
			}
		} catch (Exception e) {
			System.out.println("범위를 벗어나서 찾지 못했습니다.");
		}
		long end = System.currentTimeMillis();
		System.out.println("끝난시간 : " + end);
		System.out.println("소요시간 : " + (end - start));

	}

}
