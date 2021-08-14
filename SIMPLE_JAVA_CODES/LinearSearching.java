package searching;

import java.util.Scanner;

public class LinearSearching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter elements of array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter element you want to find:");
		int target = sc.nextInt();
		search(arr, target);
	}

	static void search(int[] arr, int target) {
		if (arr.length == 0) {
			System.out.println("Empty");
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("element found at index: " + i);
				return;
			}

		}
		System.out.println("not found");

	}

}
