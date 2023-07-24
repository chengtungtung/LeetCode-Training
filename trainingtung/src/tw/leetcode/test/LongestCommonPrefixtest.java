package tw.leetcode.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class LongestCommonPrefixtest {

	public static void main(String[] args) {
		String[] strs = { "reflower","flow","flight" };
		HashMap<String, Integer> commonstr = new HashMap<>();
		LinkedList<String> comstr = new LinkedList<>();
		String finallstr = "";

		for (int i = 0; i < strs[0].length(); i++) {
//			System.out.println("<i= "+i+">");
			for (int j = 0; j < strs[0].length() - i; j++) {
//				System.out.println("<j= "+j+">");
//				System.out.println(strs[0].substring(i, strs[0].length()-j));
//				System.out.println("---------------------");
				boolean isCommon = false;
				for (int n = 1; n < strs.length; n++) {
//					System.out.println(n);
					if (strs[n].indexOf(strs[0].substring(i, strs[0].length() - j)) != -1) {
						isCommon = true;
//						System.out.println(strs[n]);
//						System.out.println(strs[0].substring(i, strs[0].length() - j));
//						System.out.println("ok");
					} else {
						isCommon = false;
//						System.out.println("xx");
						break;
					}
//					System.out.println("---------");
				}
				if (isCommon) {
//					commonstr.put(strs[0].length() - j, strs[0].substring(i, strs[0].length() - j));
					commonstr.put(strs[0].substring(i, strs[0].length() - j), strs[0].length() - j - i);
					System.out.println("重複字" + strs[0].substring(i, strs[0].length() - j));
					comstr.add(strs[0].substring(i, strs[0].length() - j));
				}
			}
		}
		System.out.println(commonstr.values());
		System.out.println(commonstr.get("fl"));
		Collections.sort(comstr, Collections.reverseOrder());
//		Set<Integer> keys = commonstr.keySet();
//		for(Integer key : keys) {
//			System.out.println(key + ":" + commonstr.get(key));
//		}

//		for(String list : comstr) {
//			System.out.println(list);
//		}

		if (comstr.size() != 0) {
			for (int i = 0; i < comstr.size(); i++) {
				if (finallstr.length() < comstr.get(i).length()) {
					finallstr = comstr.get(i);
				}
			}
		}
		
		if(strs.length==1) {
			finallstr = strs[0];
		}
		
		System.out.println(finallstr);
	}

}
