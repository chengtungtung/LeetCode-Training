package tw.leetcode.test;

public class RemoveElementtest {

	public static void main(String[] args) {
		// nums = [3,2,2,3], val = 3
		int[] nums = { 0,1,2,2,3,0,4,2 };
		int val = 2;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=val) {
				nums[count] = nums[i];
				count++;
			}
		}
		
		System.out.println(count);
		System.out.println("----");
		for(int a : nums) {
			System.out.println(a);
		}		
		
	}

}
