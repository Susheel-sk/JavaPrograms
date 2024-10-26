import java.util.*;
public class Frequencyofstr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter string:");
		str=sc.nextLine();
		freq(str);
	}

	 public static void freq(String s) {
		for(char c ='a';c<='z';c++) {
			int count = 0;
			for(int i=0;i<s.length();i++) {
				if(c==s.charAt(i)) {
					count++;
				}
			}
			if(count!=0) {
				System.out.println(c+" "+count);
			}
		}
	 }
}