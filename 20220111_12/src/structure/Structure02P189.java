package structure;

public class Structure02P189 {
	
	// Person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
	public static void getInfo(Person p) {
		System.out.println(p.name + "의 정보입니다.");
		System.out.println("이름 : " + p.name + ",나이 : " + p.age + ",연락처 : "
		                   + p.pNum + ",번호 : " + p.uNum);
	}
	

	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요(a, b)
	
		Person a = new Person();
		a.name = "무지개";
		a.age = 20;
		a.pNum = "00000004567";
		a.uNum = 35;
		
		Person b = new Person();
		b.name = "개나리";
		b.age = 15;
		b.pNum = "11122227888";
		b.uNum = 56;
				
		getInfo(a);
        System.out.println("--------------");
        getInfo(b);
	}

}
