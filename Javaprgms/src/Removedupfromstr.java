import java.util.HashSet;
import java.util.Set;
public class Removedupfromstr{
	public static void main(String args[]) {
	String s = "abbac";
	HashSet<Character> set = new HashSet<>();
	for(int i=0;i<s.length()-1;i++) {
		set.add(s.charAt(i));
	}
	StringBuilder sb = new StringBuilder();
	for(char c : set) {
		sb.append(c);
	}
	System.out.println("The Duplicates in the given String are:" + sb);
	}
}
	
	
	
