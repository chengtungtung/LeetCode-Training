package tw.leetcode.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class LongestCommonPrefixtestV2 {

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		HashMap<String, Integer> commonstr = new HashMap<>();
		LinkedList<String> comstr = new LinkedList<>();
		String finallstr = "";
		
		for (int i = 0; i < strs[0].length(); i++) {
			boolean isCom = false;
			System.out.println(strs[0].substring(0, strs[0].length() - i));
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].indexOf(strs[0].substring(0, strs[0].length() - i)) == 0) {
					isCom = true;
					System.out.println(strs[j]);
					System.out.println(strs[0].substring(0, strs[0].length() - i));
					System.out.println("ok");
				} else {
					isCom = false;
					System.out.println("xx");
					break;
				}
			}
			if (isCom) {
				finallstr = strs[0].substring(0, strs[0].length() - i);
				System.out.println("重覆字" + finallstr);
				break;
			}
		}
		
		if(strs.length==1) {
			finallstr = strs[0];
		}


		System.out.println("開頭共同字： "+finallstr);
	}

}
