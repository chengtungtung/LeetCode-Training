package tw.leetcode.test;

import java.util.Arrays;

public class ContainsDuplicatetest {

	public static void main(String[] args) {
		
		int[] nums = { 2,14,18,22,22 };
		Arrays.sort(nums);
		Boolean isContainsDuplicate = false;

//		for(int newnums : nums) {
//			System.out.print(newnums);
//		}

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				System.out.println("i= "+i);
				System.out.println("j= "+j);
				if (nums[i] == nums[j]) {
//					System.out.println("有重複");
					
					System.out.printf("i%d是%d，j%d是%d", i, nums[i], j, nums[j]);
					isContainsDuplicate = true;
					break;
				} else {
//					System.out.println("沒有重複");
					isContainsDuplicate = false;
				}
			}
			if(isContainsDuplicate) break;
		}

		System.out.println("\n"+isContainsDuplicate);

	}

}
