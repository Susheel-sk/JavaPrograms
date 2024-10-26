import java.util.Arrays;

public class SwapAlternate{
	public static void Swaparr(int[] arr)
	{
		for(int i=0;i<arr.length;i+=2)
		{
			if(arr[i+1]>arr[i])
			{
				int temp = arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
			}
		}
	}
	public static void printarr(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
			
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6};
		Swaparr(arr);
		System.out.print("Array elements are:");
		printarr(arr);
		
	}
}  
