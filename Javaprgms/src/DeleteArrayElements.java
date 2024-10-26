
import java.util.Scanner;

public class DeleteArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int loc;
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter array loc:");
		loc=sc.nextInt();
		for(int i=loc;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
			
		}
		System.out.println("deleted element:");
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}