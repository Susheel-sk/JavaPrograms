

public class CountSpecialChar {
	public static void main(String[] args) {
		String str="BacHa*^+";
		int lowercount =0;
		int uppercount=0;
		int specialcount =0;
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c>='a' && c<='z')
			{
				lowercount++;
			}
			else if(c>='A' && c<='Z')
			{
				uppercount++;
			}
			else
			{
				specialcount++;
			}
		}
		
			
			System.out.println(specialcount);
			System.out.println(lowercount);
			System.out.println(uppercount);
		}
			
	}


		