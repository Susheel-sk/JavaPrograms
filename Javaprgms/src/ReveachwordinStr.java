
public class ReveachwordinStr {

	public static void main(String[] args) {
		String s = "code java";
		String[] word = s.split(" ");
		String finalstr = "";
		for(String words : word) {
			String revword = "";
			for(int i=words.length()-1;i>=0;i--) {
				revword = revword + words.charAt(i);
			}
			finalstr = finalstr + revword + " ";
		}
		System.out.println(finalstr);
	}
}