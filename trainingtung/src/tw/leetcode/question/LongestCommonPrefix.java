package tw.leetcode.question;

import java.util.LinkedList;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		LinkedList<String> comstr = new LinkedList<>();
		String finallstr = "";

		for (int i = 0; i < strs[0].length(); i++) {
			for (int j = 0; j < strs[0].length() - i; j++) {
				boolean isCommon = false;
				for (int n = 1; n < strs.length; n++) {
					if (strs[n].indexOf(strs[0].substring(i, strs[0].length() - j)) != -1) {
						isCommon = true;
					} else {
						isCommon = false;
						break;
					}
				}
				if (isCommon) {
					comstr.add(strs[0].substring(i, strs[0].length() - j));
				}
			}
		}

		if (comstr.size() > 0) {
			for (int i = 0; i < comstr.size(); i++) {
				if (finallstr.length() < comstr.get(i).length()) {
					finallstr = comstr.get(i);
				}
			}
		}
		
		if(strs.length==1) {
			finallstr = strs[0];
		}
		
		

		return finallstr;
	}
}
