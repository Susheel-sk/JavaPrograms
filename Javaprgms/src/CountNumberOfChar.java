
public class CountNumberOfChar {
    public static void main(String args[]) {
        int count = 0;
        int vcount = 0;
        int ccount = 0;
        String str = "code in java";
        for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)!=' ') {
        		count++;
        	}
        	if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
        	{
        		vcount++;
        	}
        	else if(str.charAt(i) >= 'a'&& str.charAt(i) <= 'z')
        	{
        		ccount++;
        	}
        }
        System.out.println("Number of char present:"+count);
        System.out.println("Number of vowels present:"+vcount);
        System.out.println("Number of consonants present:"+ccount);
    }
}
        