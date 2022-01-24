package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		// 차 2대 생성
		
		Car c1 = new Car();
		c1.model = "Genesis";
		c1.price = 16557000;
		c1.master = "고양이";
		
		Car c2 = new Car();
		c2.model = "Tesla";
		c2.price = 80000000;
		c2.master = "머스크";		
		
		// 콘솔에 정보 조회하기
		c1.getInfo();
		c2.getInfo();
	}
}
