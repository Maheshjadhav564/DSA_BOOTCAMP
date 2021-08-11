import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter number: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(" Given no is EVEN....  ");

		} else {
			System.out.println(" given no os ODD....");
		}

	}
}