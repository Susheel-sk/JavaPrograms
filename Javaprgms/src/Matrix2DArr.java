import java.util.Scanner;

public class Matrix2DArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[2][2];
		System.out.println("enter array elements");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix elements");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("matrix elements");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.print("\n");
		}

	}

}
