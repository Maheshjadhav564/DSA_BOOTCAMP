import java.util.Scanner;

public class AvrageOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many numbers you want: ");
		int num = sc.nextInt();
		int avg=0;
		int arr[] = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i]=sc.nextInt();
			avg = avg+arr[i];
		}
		avg = avg/num;
		System.out.println("Average of numbers is: " + avg);
	}

}
