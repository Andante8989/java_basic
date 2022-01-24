import java.util.Scanner;

public class ForWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = 0;
		while (b < a) { 
			int c = 0;
			while (c < a) {
			 System.out.print("*");
			 c++;
		 } 
		System.out.println();
		b++;
	  }
   }
}
