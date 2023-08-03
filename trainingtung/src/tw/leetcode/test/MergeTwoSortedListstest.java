package tw.leetcode.test;

import java.util.Arrays;

public class MergeTwoSortedListstest {
	//
	//
	ListNode list1 = new ListNode(1);
	ListNode list2 = new ListNode(2,list1);
	ListNode list3 = new ListNode(4,list2);
	
	class ListNode {
		 int val;
		
		 ListNode next;
	
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	//		
	//
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
