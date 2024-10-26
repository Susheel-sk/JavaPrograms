import java.util.*;
public class Palindrome{
	public static void main(String []args)
	{
		int c,n,r,rev=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number:");
	     n = scan.nextInt();
	     c = n;
	     while(n>0) {
	    	 r = n%10;
	    	 rev = rev*10+r;
	    	 n = n/10;
	     }
	     if(c==rev) {
	    	 System.out.println("Palindrome");
	     }else {
	    	 System.out.println("not palindrome");
	     }
	}
}