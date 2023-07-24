package tw.leetcode.question;

import java.util.HashMap;
import java.util.LinkedList;

public class RomantoIntegerV4 {
	public int romanToInt(String s) {
		HashMap<String, Integer> list2 = new HashMap<>();
		int value = 0;
		list2.put("I", 1);
		list2.put("V", 5);
		list2.put("X", 10);
		list2.put("L", 50);
		list2.put("C", 100);
		list2.put("D", 500);
		list2.put("M", 1000);
		
		
		for(int i=0;i<s.length()-1;i++) {
			if(list2.get(s.substring(i, i+1)) < list2.get(s.substring(i+1, i+2))) {
				value= value-list2.get(s.substring(i, i+1)); 
			}else {
				value= value+list2.get(s.substring(i, i+1));
			}
		}
		value= value+list2.get(s.substring(s.length()-1, s.length()));		
		
		return value;
	}
}
