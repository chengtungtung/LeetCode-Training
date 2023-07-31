package tw.leetcode.test;

public class SearchInsertPositiontest {

	public static void main(String[] args) {
		// Input: nums = [1,3,5,6], target = 5
		// Output: 2
//		Input: nums = [1,3,5,6], target = 2
//		Output: 1
//		Input: nums = [1,3,5,6], target = 7
//		Output: 4
		
		int[] nums = {1,3,5,6};
		int target = 5;
		int index = 0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target) {
				index = i;
				break;
			}else if(nums[i] > target){
				index = i;
				break;
			}else{
                index = i+1;
            }
		}
		
		System.out.println(index);

	}

}
