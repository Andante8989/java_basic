
public class Explain {

	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
				// math = 96, 23, 52, 82, 72, 31, 58
				// eng = 62, 42, 68, 31, 80, 77, 45
				// com = 10, 28, 39, 74, 65, 90, 98
				// 수학(math) 평균점수를 내주시되, 합격자 평균만 내주세요
				// 합격점수는 60점 이상입니다.
		
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		
		int mathtotal = 0;
		int count = 0;
		
		for(int score : math) {
			if (score <60) {
				continue;
			}
			mathtotal += score;
			count += 1;
		}
		System.out.println("수학 평균은 : " + mathtotal/count);
		
	}

}
