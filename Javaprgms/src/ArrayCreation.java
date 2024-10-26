
import java.util.*;
public class ArrayCreation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("====================");
		System.out.println("Array Elements are:");
		for(int i=0;i<arr.length;i++) {
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("=====================");
		System.out.println("Enter Array Location to find element:");
		int l = sc.nextInt();
		if(l>=0 && l<n) {
			System.out.println("Location found"+arr[l]);
		}else {
			System.out.println("Location Not Found");
		}
		System.out.println("=======================");
		System.out.println("Enter Array Element to search:");
		int s = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==s) {
				System.out.println("Element found");
				
			}
		}
		System.out.println("Element not found");
		System.out.println("==========================");
		System.out.println("Enter array element to be deleted");
		int d = sc.nextInt();
		int[] newarr = new int[arr.length-1];
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(i==d) {
				continue;
			}else {
				newarr[count++]=arr[i];
			}
		}
		for(int i=0;i<newarr.length;i++) {
		System.out.println(newarr[i]);
		}
	}
}
		