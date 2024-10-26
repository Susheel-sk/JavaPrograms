import java.util.Arrays;

public class MergetwosortedArrays {
 public static int[] Merge(int[] a,int[] b) {
	 int[] c = new int[a.length+b.length];
	 for(int i=0;i<a.length;i++) {
		 c[i]=a[i];
	 }
	 for(int i=0;i<b.length;i++) {
		 c[i+a.length]=b[i];
	 }Arrays.sort(c);
	return c;
	
 }
 public static void main(String args[]) {
	 int[] a = {1,7,3};
	 int[] b = {4,3,6};
	 int[] res = Merge(a,b);
	 System.out.println("Merged Array"+Arrays.toString(res));
 }
}
		