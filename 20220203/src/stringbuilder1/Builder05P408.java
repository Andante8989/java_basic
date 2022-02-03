package stringbuilder1;

public class Builder05P408 {

	public static void main(String[] args) {
		// 다음 문자열의 문자를 0번부터 시작해서 3번째마다 삭제해주세요.
		// 힌트 : 반복문을 쓰세요
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		
		int count = 0;
		
		for (int b = 0; b < a.length(); b++) {
			a.deleteCharAt(count);
			count += 2;
			if (a.length() < count) {
				break;
			}
		}
		System.out.println(a);
	}
}
