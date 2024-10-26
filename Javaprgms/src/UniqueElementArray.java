
public class UniqueElementArray {
	public static int unique(int[] arr) {
		int ans = 0;
		for(int i=0;i<arr.length;i++) {
			ans = ans ^ arr[i];
		}
		return ans;
	}
	public static void main(String args[])
	{
		int[] arr = {2,2,1,4,3,3,4};
		int res = unique(arr);
		System.out.println("the unique array element is:"+res);
	}
}
			
			
			
			
		
