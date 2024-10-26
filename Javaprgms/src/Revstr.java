import java.util.*;
public class Revstr{
	public static void main(String args[])//hello
	{
		rev("hello");
	}
	public static void rev(String s) {
		char[] c =s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
	}
}