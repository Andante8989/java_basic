package string1;

import java.util.Scanner;

public class String03P399 {

	public static void main(String[] args) {
		// Scanner를 통해서 전체 문장을 입력받으세요
		// 다음으로 문장내에서 찾고싶은 단어를 추가로 입력받으세요.
		// 문장 내에 있는 단어들의 인덱스 번호와, 몇 개가 검출되었는지
		// 출력해주는 코드를 작성해 보세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문장을 입력해주세요.");
		String sentence = scan.nextLine();
		System.out.println("문장 내에서 카운팅할 단어를 입력해주세요.");
		String search = scan.nextLine();
		
		int count = 0;  // 갯수 카운팅
		boolean bool = true;  // 반복문 추가 실행 여부
		int fnl = -1;  // 아래 글처럼 +1을해줫으므로 0번부터 찾아야되기때문에 -1로 선언해줘야됨
		while (bool) {
			int get = sentence.indexOf(search, fnl + 1); // fnl + 1은 indexOf 특성상 검색끝내면 종료하므로 한칸더 올릴필요가있음
			if (get == -1) { // 마지막으로 검색시 -1이나오면 무한반복문을 탈출할수있게 하는구문
				bool = false;			
			} else {
				fnl = get; // 마지막 발견 갱신
				count += 1; // 글씨 카운트 증가
				System.out.println(get + "번 인덱스에서 " + count + "번째 " + search + " 이(가) 검출되었습니다");
			}
		
		}
		System.out.println(search + "의 총 검출 횟수는 " + count + "회 입니다.");
	}

}
