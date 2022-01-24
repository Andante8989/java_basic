import java.util.Scanner;

public class ContinueQ1P123 {

	public static void main(String[] args) {
		// 1부터 n까지 총합을 구하되 홀수끼리만 더한
		// 총합을 구하는 구문을 작성해주세요.
		// continue문을 반드시 사용하는 로직으로 작성해주세요.
		// n은 스캐너로 입력받습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("목표 정수를 입력해주세요.");
		int goal = scan.nextInt();
		int count = 0; // break 문제와 달리 0으로 시작하는 이유는 while 구문의 continue 때문이다
		               // 
		int total = 0;
		 
		while(count < goal) {
		   count += 1;    // 이곳에 위치하지않고 맨아래에 위치할시 2 % 2=0이되며 +1하지않고 바로 
		                  // continue를만나 18번으로 올라가기때문
		   if (count % 2 == 0) { 
			 continue;
		   }
		   total += count;
		   System.out.println("현재 1부터 " + count + "까지 더했습니다.");
		   System.out.println("총합은 " + total + "입니다.");
         
           scan.close();
		}
	}   
}
