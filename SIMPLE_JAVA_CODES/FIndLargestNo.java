import java.util.Scanner;

public class FIndLargestNo {

	public static void main(String[] args) {
		System.out.println(" demo for accepting no till 0 encounters ");

		Scanner sc = new Scanner(System.in);

		System.out.println(" start entering nombes:  ");
		int largest = 1;
		int num = largest;
		while (num != 0) {
			num = sc.nextInt();

			if (num > largest) {
				largest = num;
			}

		}
		System.out.println(" largest no is .." + largest);
	}

}
