import java.util.*;
public class Revarr{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Reversed Elements are:");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] +" ");
		}
	}
}