import java.util.Arrays;

public class Swappingfirstandlastarrele {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int first = arr[0];
		int last = arr[arr.length-1];
		   arr[arr.length-1] = first;
		   arr[0] = last;
		   
			System.out.println(Arrays.toString(arr));
		}
		
		//returns string representation of specified array
	}//string representation :list of arr elements enclosed in square brackets;




