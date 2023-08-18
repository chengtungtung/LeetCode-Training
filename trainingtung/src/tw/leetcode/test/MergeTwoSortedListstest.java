package tw.leetcode.test;

import java.util.Arrays;

public class MergeTwoSortedListstest {
	Solution test = new Solution();
	ListNode list12 = new ListNode(5);
	ListNode list11 = new ListNode(3, list12);
	ListNode list1 = new ListNode(1, list11);

	ListNode list22 = new ListNode(6);
	ListNode list21 = new ListNode(4, list22);
	ListNode list2 = new ListNode(2, list21);

	public static void main(String[] args) {
		MergeTwoSortedListstest test1 = new MergeTwoSortedListstest();
		System.out.println("測試" + test1.test.mergeTwoLists(test1.list1, test1.list2));
//		System.out.println(test1.list1.val);
//		System.out.println(test1.list1.next.val);
//		System.out.println(test1.list1.next.next.val);
//		System.out.println(test1.list1.next.next.next.val);
//		System.out.println(test1.list1.next.next.next.next.val);
//		System.out.println(test1.list1.next.next.next.next.next.val);
		
	
	}
	class Solution {

		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			ListNode nextNode = new ListNode(); 
			ListNode newNode = new ListNode(); 
			ListNode nowNode1 = list1; 
			ListNode nowNode2 = list2; 
			int i = 0;
			while(nowNode2 != null) {
				if(nowNode1.val <= nowNode2.val) {
					ListNode newone = new ListNode(nowNode2.val); 
					ListNode temp = nowNode1.next;
					nowNode1.next = newone;
					newone.next = temp; 
					i++;
					System.out.println("1<2 => 第" + i + "圈 " + nowNode1.val + " , " + nowNode2.val);
					nowNode1 = newone.next;
					nowNode2 = nowNode2.next;
					
				}else {
					ListNode newone = new ListNode(nowNode2.val); 
					ListNode temp = nowNode1;
					nowNode1 = newone;
					newone.next = temp;
					list1 = newone;
					i++;
					System.out.println("1>2 => 第" + i + "圈 " + nowNode1.val + " , " + nowNode2.val);
					nowNode1 = temp;
					nowNode2 = nowNode2.next;
					System.out.println("目前指標： " + nowNode1.val + nowNode2.val);
				}
				
			}
			System.out.println("---------以下---------");
			System.out.println(list1.val);
			System.out.println(list1.next.val);
			System.out.println(list1.next.next.val);
			System.out.println(list1.next.next.next.val);
			System.out.println(list1.next.next.next.next.val);
			System.out.println(list1.next.next.next.next.next.val);
			System.out.println("---------以上---------");
			
//			if (list1.val <= list2.val) {
//				nextNode = list1.next;
//				list1.next = list2;
//				list1.next.next.next.next= nextNode;
//				System.out.println("ok");
//			} else {
//				list2.next = list1;
//			}

			return list1;
		}
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	
	
}
