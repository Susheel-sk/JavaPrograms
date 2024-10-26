
public class RemoveSpecialchar {

	public static void main(String[] args) {
		String str = "j&av*a";
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if((c>='a' && c<='z') || (c>='A' && c<='Z')){
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}