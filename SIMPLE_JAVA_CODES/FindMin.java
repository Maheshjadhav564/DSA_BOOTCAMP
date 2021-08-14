package searching;

public class FindMin {

	public static void main(String[] args) {
			
		int[] arr = {23,2,45,-1,-2,-6,12,67,78,89,90,12,43};
		
		System.out.println(min(arr));
	}

	static int min(int[] arr) {
		int ans = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < ans){
				ans = arr[i];		
			}
			 
		}
		return ans;
	}

}
