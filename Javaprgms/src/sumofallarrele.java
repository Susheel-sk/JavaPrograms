
public class sumofallarrele {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int average = 0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			average = sum/arr.length; 
		}
		System.out.println("The sum of array element is:"+sum);
		System.out.println("The average of array element is:"+average);
	}
}