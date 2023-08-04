package tw.leetcode.test;

import java.util.Arrays;

public class MergeTwoSortedListstest {
	Solution test = new Solution();
	ListNode list12 = new ListNode(4);
	ListNode list11 = new ListNode(2, list12);
	ListNode list1 = new ListNode(1, list11);

	ListNode list22 = new ListNode(4);
	ListNode list21 = new ListNode(3, list22);
	ListNode list2 = new ListNode(1, list21);

	public static void main(String[] args) {
		MergeTwoSortedListstest test1 = new MergeTwoSortedListstest();
		System.out.println(test1.test.mergeTwoLists(test1.list1, test1.list2));
		System.out.println(test1.list1.val);
		System.out.println(test1.list1.next.val);
		System.out.println(test1.list1.next.next.val);
		System.out.println(test1.list1.next.next.next.val);
		System.out.println(test1.list1.next.next.next.next.val);
		System.out.println(test1.list1.next.next.next.next.next.val);
	}

	class Solution {
		
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			
			if(list1.val<=list2.val) {
				list1.next = list2;
				System.out.println("ok");
			}else {
				list2.next = list1;	
			}
			
			return list1;
		}


	}
	class ListNode {
		int val;
		ListNode next;

		ListNode() {}

		ListNode(int val) {this.val = val;}

		ListNode(int val, ListNode next) {this.val = val;this.next = next;}
	}
}
