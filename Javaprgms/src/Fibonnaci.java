import java.util.*;
public class Fibonnaci{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,n;
		System.out.println("enter number:");
		n=sc.nextInt();
		a=0;
		b=1;
		for(int i=1;i<=n;i++) {
//			System.out.println(a+" ");
			int res=a+b;
			a=b;
			b=res;
			System.out.println(a);
		}
	}
}

