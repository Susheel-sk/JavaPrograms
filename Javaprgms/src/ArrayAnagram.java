
import java.util.Arrays;
class ArrayAnagram{ 
public static boolean anagram(int[] a1,int[] a2) {
	 if(a1.length!=a2.length)
		 return false;
	 Arrays.sort(a1);
	 Arrays.sort(a2);
	 for(int i=0;i<a1.length;i++) {
		 if(a1[i]!=a2[i]) {
			 return false;
		 }
		 
	 }
	 return true;
}
 
 
 public static void main(String[] args) {
	int[] a1 = {1,2,3,4,5};
	int[] a2 = {1,2,3,4,5};
	if(anagram(a1,a2)) {
		System.out.println("Arrays are equal");
	}else {
		System.out.println("Arrays are not equal");
	}
 }
}
		


	
