
public class OddEven {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		String ans = " ";
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				ans = ans + "Even";//ans = ans + "even";
			}
			else {
				ans+="Odd";
				
				
			}
		}
		System.out.println(ans.trim()); 
		
	}

}
