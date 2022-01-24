package Overloading;

public class Parttimer {
	// 파트타이머 정보
	// 오전여부, 시급, 가게면, 본인이름
	
	private boolean afternoon; // true면 오후, 아니면 오전
	private int pay; // 시급
	private String shopName; // 가게명
	private String name;  // 본인이름
	
	// 생성자 오버로딩은, 생성자도 메서드이니 생성자를 여러 개 오버로딩 형식으로 만드는 것입니다.
	// afternoon, pay, shopName, name을 모두 받아 저장해주는 생성자를 만들어주세요
	// 접근 제한자는 public 입니다,
	
	public Parttimer (boolean a, int b, String n, String p ) {
		// 시급이 9160원 미만라면 강제로 9160을 집어넣고
		// 아니면 입력받은 금액을 그대로 입력하도록 수정해보세요
		if (b < 9160) { 
			pay = 9160;
		} else {
			pay = b;
		}
		afternoon = a;
	    shopName = n;
	    name = p;
	    // 전달 데이터 확인
	    System.out.println("알바가 생성되었습니다.");
	    System.out.println("오후알바 : " + afternoon);
	    System.out.println("시급 : " + pay);
	    System.out.println("가게명 : " + shopName);
	    System.out.println("알바생이름 : " + name);
	}    
	    // 오버로딩은 이름은 같은데 파라미터값의 종류나 개수가 다르면 중복 작성을 허용합니다.
	    // afternoon, shopName, name만 입력받는 생성자를 하나 더 중복작성 해주세요
	    // pay는 입력받지 않고 바로 최저시급으로 넣습니다
	
	public Parttimer (boolean a, String n, String p) {
		afternoon = a;
		pay = 9160;
		shopName = n;
		name = p;
		System.out.println("알바가 생성되었습니다.");
	    System.out.println("오후알바 : " + afternoon);
	    System.out.println("시급 : " + pay);
	    System.out.println("가게명 : " + shopName);
	    System.out.println("알바생이름 : " + name);
	
	}
}
