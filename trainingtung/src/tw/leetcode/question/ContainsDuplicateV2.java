package tw.leetcode.question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateV2 {
	public boolean containsDuplicate(int[] nums) {
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
		

		return isContainsDuplicate;
	}
}
