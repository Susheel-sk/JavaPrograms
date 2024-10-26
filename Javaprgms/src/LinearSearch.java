import java.util.*;
public class LinearSearch{
	boolean search(int arr[],int size, int key) {
		for(int i=0;i<size;i++) {
			if(arr[i]==key) {
				return true;
				
			}
		}
		return false;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,22,57,47,34,18,66};
		System.out.println("enter key to be searched");
		int key = sc.nextInt();
		LinearSearch ls=new LinearSearch();
		boolean found=ls.search(arr,7,key);
		if(found) {
			System.out.println("key is present");
			
		}else
		{
			System.out.println("key is absent");
		}
		
		
		
	}
}