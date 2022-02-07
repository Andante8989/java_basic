import java.util.Scanner;

public class Javaexplain {

	public static void main(String[] args) {
	
		// Scanner를 통해서 전체 문장을 입력받으세요
		// 다음으로 문장내에서 찾고싶은 단어를 추가로 입력받으세요.
		// 문장 내에 있는 단어들의 인덱스 번호와, 몇 개가 검출되었는지
		// 출력해주는 코드를 작성해 보세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문장을 입력하세요.");
		String sentence = scan.nextLine();
		System.out.println("찾을 단어를 입력하세요");
		String search = scan.nextLine();
		
		int fnl = -1;
		int count = 0;
		boolean bool = true;
		
		while (bool) {
			int get = sentence.indexOf(search, fnl + 1);
			if (get == -1) {
				bool = false;
			} else {
				count += 1;
				fnl = get;
				System.out.println(search + "를 " + get + "번째에서 " + count + " 번 찾았습니다.");
			}
		}
		System.out.println("총 " + count + " 번 찾았습니다.");
		
	}

}
