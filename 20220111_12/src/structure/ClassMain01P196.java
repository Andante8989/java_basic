package structure;

public class ClassMain01P196 {
	
	// PersonClass를 조회할 메서드는 작성할 필요가 없습니다.
	// 이미 PersonClass 내부에 필요한 메서드를 작성해놨기 때문입니다.

	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요(PersonClass)
		
		PersonClass a = new PersonClass();
		
	    a.name = "고양이";
	    a.age = 3;
	    a.pNum = "01033334444";
	    a.uNum = 34;
	    a.glasses = true;
	    
	    PersonClass p2 = new PersonClass();
	    
	    p2.name = "강아지";
	    p2.age = 5;
	    p2.pNum = "01988887777";
	    p2.uNum = 10;
	    p2.glasses = false;
	    
	    a.getInfo();
	    p2.getInfo();
	    

	}

}
