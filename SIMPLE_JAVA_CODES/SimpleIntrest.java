import java.util.Scanner;


public class SimpleIntrest {

	public static void main(String[] args) {
		System.out.println("simple intrest program:.....");
		getdata();
	}

	private static void getdata() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principle amount: ");
		float princ = sc.nextFloat();
		
		System.out.println("Enter rate of intrest:  ");
		float rate = sc.nextFloat();
		
		System.out.println("Enter duration in years: ");
		float time = sc.nextFloat();
		
		
		calculateIntrest(princ, rate, time);
	}

	private static void calculateIntrest(float p, float r, float t ) {
		float si = (p * r * t)/100;
		System.out.println("simple intrest is = " + si);
	}

}
