

public class CheckIfArrIsSortedAndRotated {
	public boolean check(int[] nums)
	{
		int count = 0;
		int n=nums.length;
		for(int i=1;i<nums.length;i++)
		{
			if(nums[i-1]>nums[i])
			{
				count++;
			}
		}
		if(nums[n-1]>nums[0]) {
			count++;
		}
		return count<=1;
		
	}

	public static void main(String[] args) {
		int[] nums = {4,5,1,2,3};
		
		CheckIfArrIsSortedAndRotated c = new CheckIfArrIsSortedAndRotated();
		boolean res = c.check(nums);
		System.out.println(res);
		
		
	}

}
