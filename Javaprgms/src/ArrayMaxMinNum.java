
public class ArrayMaxMinNum {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			else if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("max number is:"+max+",min number is:"+min);
	}
}