package static2;

public class Main01P276 {

	public static void main(String[] args) {
		// Asean 조원 생성 없이 발표점수를 콘솔에 찍어보세요.
		// System.out.println(Asean.presentationScore);
		System.out.println(Asean.getPresentationScore());
		
		// Asean 조원 4명을 자율적으로 만든 다음, 각 인원의 성적을 조회해주세요
		Asean a1 = new Asean(10, 40, 50);
		Asean b1 = new Asean(20, 80, 40);
		Asean c1 = new Asean(50, 40, 90);
		Asean d1 = new Asean(10, 100, 30);
		
		a1.showAseanInfo();
		System.out.println("-------------------");
		b1.showAseanInfo();
		System.out.println("-------------------");
		c1.showAseanInfo();
		System.out.println("-------------------");
		d1.showAseanInfo();

	}

}
