package tw.leetcode.question;

import java.util.Arrays;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		Boolean isContainsDuplicate = false;


		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					isContainsDuplicate = true;
					break;
				} else {
					isContainsDuplicate = false;
				}
			}
		}
		
		
		return isContainsDuplicate;
	}

}
