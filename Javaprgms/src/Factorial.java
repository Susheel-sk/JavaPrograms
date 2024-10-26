import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n,fact=1;
		System.out.println("enter number");
		n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of number is:"+fact);
		}
}


	
