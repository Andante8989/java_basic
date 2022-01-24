import java.util.Scanner;

public class ScannerQ1P93 {

	public static void main(String[] args) {
		// 환율 계산기를 만들어보겠습니다.
		// 네이버에 검색해서 원하는 국가 화폐의 환율을 rate 변수에 저장해주세요.
		// 스캐너를 이용해서 won 변수에 원화 금액을 입력해주세요.
		// 원화와 환율을 이용해서
		// 원화 xxxxx원을 환전시 YYYY(화폐) 입니다. 로 결과물을 출력해주세요
		// ex) 원화 3500000원을 환전시 3200달러입니다.
		
		Scanner scan = new Scanner(System.in);
		
		double rate = 285.92;
		
		System.out.println("말레이시아 링깃의 환율은 " + rate + "입니다.");
		System.out.println("원화를 입력해주세요.");
		int won = scan.nextInt();
		
	    
	    System.out.println("원화 " + won + "원을 말레이시아 링깃으로 환전시 ");
	    System.out.println(won/rate + " 링깃 입니다");
	    
	    scan.close();
	    

	}
	

}
