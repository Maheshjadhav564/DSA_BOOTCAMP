import java.util.Scanner;


public class WhileDemo {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = 1 ;
			int sum = 0;
			System.out.println("Start entering numbers....");
			while(num != 0){
				
				num = sc.nextInt();
				sum = sum + num;
				
			}
			System.out.println(" sum of all numbers entered is : " + sum );
	}

}
