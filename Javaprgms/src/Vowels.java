public class Vowels{
	public static void main(String args[]) {
		String str1 = "code in java";
		char ch[] = str1.toCharArray();
		int vcount = 0;
		for(int i=0;i<ch.length-1;i++)
		{
			if((str1.charAt(i) == 'a') || (str1.charAt(i) == 'e') || (str1.charAt(i) == 'i') || (str1.charAt(i) == 'o') || (str1.charAt(i) == 'u'))
			{
				vcount++;
			}
		}
		System.out.println(+vcount);
	}
}