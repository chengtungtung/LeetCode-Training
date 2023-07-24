package tw.leetcode.question;

import java.util.HashMap;
import java.util.LinkedList;

public class LongestCommonPrefixV2 {
	public String longestCommonPrefix(String[] strs) {

		String finallstr = "";

		for (int i = 0; i < strs[0].length(); i++) {
			boolean isCom = false;
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].indexOf(strs[0].substring(0, strs[0].length() - i)) == 0) {
					isCom = true;
				} else {
					isCom = false;
					break;
				}
			}
			if (isCom) {
				finallstr = strs[0].substring(0, strs[0].length() - i);
				break;
			}
		}

		

		return finallstr;
	}
}
