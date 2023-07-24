package tw.leetcode.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicatetestV2 {

	public static void main(String[] args) {
		
		int[] nums = { 2,14,18,22,22 };
		Set<Integer> newnums = new HashSet<>();
		Boolean isContainsDuplicate = false;

		
		for(int a : nums) {
			newnums.add(a);
		}
		
		if(newnums.size()==nums.length) {
			isContainsDuplicate = false;
		}else {
			isContainsDuplicate = true;
		}
		

		System.out.println(isContainsDuplicate);

	}

}
