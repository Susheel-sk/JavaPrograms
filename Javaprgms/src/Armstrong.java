
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n,c,arm=0;
		System.out.println("Enter number:");
	    n = scan.nextInt();
	    c=n;
	    while(n!=0) {
	    	int r = n%10;
	    	arm = arm+(r*r*r);
	    	n = n/10;
	    }
	    if(c==arm) {
	    	System.out.println("Armstrong");
	    }else {
	    	System.out.println("Not Armstrong");
	    }
	}
}