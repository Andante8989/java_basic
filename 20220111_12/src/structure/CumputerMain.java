package structure;

public class CumputerMain {

	public static void main(String[] args) {
		Cumputer a = new Cumputer();
		
		a.name = "가나다";
		a.price = 1500000;
		a.master = "마바사";
		
		Cumputer ict = new Cumputer();
		
		ict.name = "엘지";
		ict.price = 1000;
		ict.master = "개발원";
		
		a.getInfo();
		ict.getInfo();
		
		
		

	}

}
