package tw.leetcode.test;

import java.util.Arrays;

public class MergeTwoSortedListstest {

	public static void main(String[] args) {
		int[] list1 = {1,2,4};
		int[] list2 = {1,3,4};
		int[] finallist = new int[list1.length+list2.length];
		
		for(int i=0 ; i<list1.length ;i++) {
			finallist[i]=list1[i];
		}
		for(int i=0 ; i<list2.length ;i++) {
			finallist[list1.length+i]=list2[i];
		}
		
		Arrays.sort(finallist);
		
		for(int a :finallist) {
			System.out.println(a);
		}
		
	}

}
