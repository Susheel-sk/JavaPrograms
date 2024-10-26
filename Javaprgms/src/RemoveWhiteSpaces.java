
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "j a  v a";
		str= str.replaceAll("\\s","");
		System.out.print(str);
	}

}
