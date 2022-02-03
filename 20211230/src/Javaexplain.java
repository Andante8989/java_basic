
public class Javaexplain {

	public static void main(String[] args) {
	
		String a = "java";
		String b = "hello";
		String c = new String("java");
		
		System.out.println(a.equals(c));
		System.out.println(a.equals(b));
		
		System.out.println(a == b);
		System.out.println(a == c);
	}

}
