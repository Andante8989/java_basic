package structure;

public class Structure03P190 {
	
	public static void getInfo(Cat p) { 
		System.out.println(p.name + "을 소개합니다.");
		System.out.println("이름 : " + p.name + " , 나이 : " + p.age + " , 울음소리 : " + p.noise);
	
	}

	public static void main(String[] args) {
		
		Cat a = new Cat();
		a.name = "yellow";
		a.age = 2;
		a.noise = "야옹";
		
		Cat b = new Cat();
		b.name = "black";
		b.age = 4;
		b.noise = "이응";
			
		getInfo(a);
		System.out.println("------------");
		getInfo(b);
		
	}

}
