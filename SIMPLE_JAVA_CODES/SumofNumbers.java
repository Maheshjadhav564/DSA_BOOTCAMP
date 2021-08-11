import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how numbers you want: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int sum = 0;

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println(" Sum of numbers is: " + sum);
	}
}
