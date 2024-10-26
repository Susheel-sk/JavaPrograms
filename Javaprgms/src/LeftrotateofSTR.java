public class LeftrotateofSTR{
	public static void main(String args[])
	{
		String str="JAVA"; 
		char ch[] = str.toCharArray();
		char first =ch[0];
		char last = ch[ch.length-1];
		for(int i=0;i<ch.length-1;i++) {
			ch[i]=ch[i+1];
		}
		 ch[ch.length-1] = first;
		 StringBuilder sb = new StringBuilder();
		 for(char c :ch) {
			 sb.append(c);
		 }
		 System.out.println(sb);
	}
			
		}
		