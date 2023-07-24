package tw.leetcode.question;

public class MergeTwoSortedLists {
	 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        int[] finallist = new int[list1.length+list2.length];
			
			for(int i=0 ; i<list1.length ;i++) {
				finallist[i]=list1[i];
			}
			for(int i=0 ; i<list2.length ;i++) {
				finallist[list1.length+i]=list2[i];
			}
			
			Arrays.sort(finallist);

	        return finallist;
	    }
}
