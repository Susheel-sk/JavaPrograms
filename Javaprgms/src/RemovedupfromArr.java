import java.util.*;
public class RemovedupfromArr{
	public static void main(String []args) {
		int[] arr = {1,1,2,3,3,4,5,5,5,3,2,1};
		
		//Using HashSet
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println("Unique Elements are:");
		for(int res : set) {
			System.out.println(res);
		}
	
		//Using Loops
//		Arrays.sort(arr);
//		int count = 0;
//		for(int i=0;i<arr.length;i++) {
//			if(i<arr.length-1 && arr[i]==arr[i+1]) {
//				continue;
//			}
//			else {
//				arr[count++]=arr[i];
//			}
//		}
//		for(int i=0;i<count;i++) {
//			System.out.println(arr[i]);
//		}
	}
}