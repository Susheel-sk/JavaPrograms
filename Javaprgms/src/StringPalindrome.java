import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		pal(str);
	}

	public static void pal(String str) {
		String s2 = "";
		for(int i=str.length()-1;i>=0;i--) {
			s2 = s2 + str.charAt(i);
		}
		if(str.equals(s2)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
		
	}