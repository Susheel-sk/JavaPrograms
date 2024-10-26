import java.util.*;
public class TransposeMatrix{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int[][] arr = new int[2][2];
	System.out.println("enter array elements:");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
		System.out.println("Array Matrix:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
		
	
		
}