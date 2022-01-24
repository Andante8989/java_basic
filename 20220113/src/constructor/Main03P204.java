package constructor;

public class Main03P204 {

	public static void main(String[] args) {
		
		// 웹툰 2개를 만들어서 연재 진행 및 완결까지 시켜보세요.
		// 연재 회차는 3~4회로 해주세요
		
		Webtoon w1 = new Webtoon("안개무덤", "김태영");
		Webtoon w2 = new Webtoon("초인의시대", "섭이");
		
		w1.uploadWebtoon();
		w1.uploadWebtoon();
		w1.completeWebtoon();
		w2.uploadWebtoon();
		w2.uploadWebtoon();
		w2.uploadWebtoon();
		w2.completeWebtoon();
		w1.getInfo();
		w2.getInfo();
		
	}

}
