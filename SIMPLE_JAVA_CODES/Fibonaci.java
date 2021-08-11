import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter number: ");
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;

		/*
		 * for(int i = 0; i<num; i++){ System.out.print(a + "  ");
		 * 
		 * c=a+b; a=b; b=c; }
		 */
		int i = 0;
		while (i < num) {
			System.out.println(a + "  ");
			
			c= a+b;
			a=b;
			b=c;
			i++;
		}
	}
}
