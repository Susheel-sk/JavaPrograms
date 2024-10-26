import java.util.Arrays;

public class RevstrwithoutRevSpecialcharanddigits{
	public static void main(String args[])
	{
		String str = "c*o_d&2e";
		char[] ch = str.toCharArray();
		int j = ch.length-1;
		for(int i=0;i<j;) {
			if(!Character.isAlphabetic(ch[i])) {
				i++;
			}
			if(!Character.isAlphabetic(ch[j])) {
				j--;
			}
			else {
				char temp = ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				i++;
				j--;
			}
		}
		System.out.println(ch);
	}
}