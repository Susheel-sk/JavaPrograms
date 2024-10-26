import java.util.Arrays;

public class SecondLargesteleinArr {

	public static void main(String[] args) {
		int[] arr = { 20,85,90,70,10};
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		System.out.println("Sorted array elements are:"+Arrays.toString(arr));
		System.out.println("The second largest element of array is:"+arr[n-2]);
	}
}