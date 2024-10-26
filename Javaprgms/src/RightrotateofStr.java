public class RightrotateofStr{
	public static void main(String args[])
	{
		String str = "JAVA";//AJAV
		char[] ch = str.toCharArray();
		int n = 3;
		for(int j=0;j<3;j++) {
		char last = ch[ch.length-1];
		for(int i=ch.length-1;i>0;i--) {
			ch[i]=ch[i-1];
		}
		ch[0]=last;
		StringBuilder sb = new StringBuilder();
		for(char c : ch) {
			sb.append(c);
		}
		System.out.println(sb);
	}
	}
}
		
		