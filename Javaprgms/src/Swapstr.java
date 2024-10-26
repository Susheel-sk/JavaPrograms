import java.util.*;
public class Swapstr {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1,str2;
		System.out.println("enter string:");
		str1 = scan.nextLine();
		str2 = scan.nextLine();
		String temp = str1;
		str1 = str2;
		str2 = temp;
	    System.out.println("Swapped strings are:"+str1+" "+str2);
	}
}

		