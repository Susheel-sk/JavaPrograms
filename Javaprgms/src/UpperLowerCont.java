
public class UpperLowerCont {
	public static void main(String[]args) {
	
		String str="SushilSK@";
		int lcount = 0;
		int ucount = 0;
		int specialcount=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z') {
				lcount++;
			}
			else if(ch>='A' && ch<='Z'){
				ucount++;
			}
			else {
				specialcount++;
			}
		}
		System.out.println(lcount);
		System.out.println(ucount);
		System.out.println(specialcount);
	}
}
			
			
		