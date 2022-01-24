
public class ContinueQ2P123 {

	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 수학(math) 평균점수를 내주시되, 합격자 평균만 내주세요
		// 합격점수는 60점 이상입니다.
		
		int math[] = {96, 23, 52, 82, 72, 31, 58};
		int eng[] = {62, 42, 68, 31, 80, 77, 45};
		int com[] = {10, 28, 39, 74, 65, 90, 98};
	    int mathtotal = 0;
	    int mathcount = 0;
	    for (int score : math) {
	    	if (score < 60) {
	    	continue;  
	     }
	    mathcount += 1;
	    mathtotal += score;
	    }
	    System.out.println("수학 평균점수는 : " + mathtotal/mathcount);
	   
	    int engtotal = 0;
	    int engcount = 0;
	    for (int asdf : eng) {
	    	if (asdf < 60) {
	    		continue;
	    	}
	    	engcount++;
		    engtotal += asdf;
	    }
	    System.out.println("영어 평균점수는 : " + engtotal/engcount);
	    
	    int comTotal = 0;
	    int comCount = 0;
	    for (int comScore : com) {
	    	if (comScore < 60) {
	    		continue;
	    	}
	    	comCount += 1;
	    	comTotal += comScore;
	    }
	    System.out.println("컴퓨터 평균점수는 : " + comTotal / comCount);
	}
	
}
