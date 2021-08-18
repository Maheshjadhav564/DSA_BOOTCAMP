import java.util.Scanner;


public class Product 
{
	public static void readdata()
	{
		System.out.println("enter product");
		int pid;
		String pname;
		float price;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter pid");
		pid = sc.nextInt();
		
		System.out.println("enter pname");
        pname = sc.next();		
        
        System.out.println("enter price");
        price = sc.nextFloat();
        float disc = caldisc(price);        
        display(pid, pname, price, disc );
	}
	public static float caldisc(float price)
	{
		System.out.println("calculated disc");
		float disc = price * 0.2f;
		System.out.println("disc is" + disc );
		return disc;
		
	
	}
	public static void display(int pid, String pname, float price, float disc )
	{
		System.out.println("details entered are as follows");
		System.out.println("entered deatails are  "  + pid + "  " +  pname  + "  " + price + " " + disc);
		
	}
	public static void main(String[] args) 
	{
		
//		System.out.println("enter products");
//		int count;
//		int pid;
//		String pname;
//		float price;
//		Scanner sc = new Scanner(System.in);
//		
//		
//		
//		System.out.println("enter pid");
//		pid = sc.nextInt();
//		
//		System.out.println("enter pname");
//        pname = sc.next();		
//        
//        System.out.println("enter price");
//        price = sc.nextFloat();
//		
//        float disc = price*0.02f;
//        System.out.println("disc is =" + disc);
//        System.out.println("entered deatails are  "  + pid + "  " +  pname  + "  " + price);
		
        readdata();
        
       
        
		
	}
}
