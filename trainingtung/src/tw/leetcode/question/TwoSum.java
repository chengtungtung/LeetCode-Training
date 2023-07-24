package tw.leetcode.question;

public class TwoSum {

	 public int[] twoSum(int[] nums, int target) {
//		nums = [2,7,11,15], target = 9
//				Output: [0,1]
//       int[] nums = new int[] {};
       int a = nums.length;
       int[] ans =new int[2];
       for(int i= 0;i<a;i++) {
    	   for(int j=i+1;j<a;j++) {
//    		   System.out.println(nums[i]+nums[j]);
    		    if(nums[i]+nums[j]==target) {
    		    	ans[0]=i;
    		    	ans[1]=j;
    		    
    		    	
    		    }
    		   
    	   }
    	  
       }
	
//	return ans;
	return null;
	}

}
