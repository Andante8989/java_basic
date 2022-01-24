
public class UnaryQ1P65 {

	public static void main(String[] args) {
		// int a에 15를 담은 다음 후위 -> 전위 순으로 --를 Unary01P65처럼 사용해서
		// 1씩 차감하고 콘솔에 찍는것을 반복해주세요.
		// 단, 실행 로직은 Unary01P65에서 그랬듯 주석으로 하단에 풀어서 작성까지 해 주세요.
		int a = 15;
		System.out.println(a--); // 후위수식, 실행 전에 a값(15)을 출력
		// a값(15)출력후 1을 감소 a(15)-1
		// 
		System.out.println(a); // a값은 1 감소된 값(14)으로 유지
		System.out.println(--a); // 전위수식, a값(14)를 1감소한 값(13)로 출력
		// a값(14)에서 1감소  : a(14) - 1
		// 감소된 a값을 콘솔에 출력 : sysout(a(13))
		System.out.println(a); // a값(13)을 출력

	}

}
