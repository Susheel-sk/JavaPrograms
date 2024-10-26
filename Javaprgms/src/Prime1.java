import java.util.*;
public class Prime1{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,count=0;
		System.out.println("enter number:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime numer");
		}
	}
}
		