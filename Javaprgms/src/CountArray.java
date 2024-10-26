
import java.util.Arrays;

public class CountArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		int sum = 0;
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==0 && arr[i]%2==0) {
				sum = sum +arr[i];
			}
		}
		System.out.println(sum);
	}
}
