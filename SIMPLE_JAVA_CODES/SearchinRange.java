package searching;

import java.util.Scanner;

public class SearchinRange {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int[] arr = {10,23,34,56,78,98,45,67,43,22,1,2};
			int target = 555;
			
			System.out.println(linearSearch(arr, target, 3, 9));
			
	}

	static int linearSearch(int[] arr, int target, int start, int end) {
		
		if(arr.length == 0){
			System.out.println("empty");
			return -1;
		}
		
		for(int index = start; index <= end; index++){
			if(arr[index] == target){
				return index;
			}
		}
		return -1;
	}

}
