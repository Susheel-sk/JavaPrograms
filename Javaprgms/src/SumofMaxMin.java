import java.util.*;
public class SumofMaxMin{
	public static int findSumofMaxandMin(int[] arr) {
		if(arr.length==0) {
			return 0;
	}

		
	int max = arr[0];
	int min = arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i] > max) {  
			max = arr[i];
		}
		if(arr[i] < min) {
			min = arr[i];
		}
	}return max + min;
}
	
	public static void main(String args[]) {
		int[] arr = {10,20,30,40,50};
		int res = findSumofMaxandMin(arr);
		System.out.println("The sum of MaxMin is:"+res);
		
	}
	}

	

	