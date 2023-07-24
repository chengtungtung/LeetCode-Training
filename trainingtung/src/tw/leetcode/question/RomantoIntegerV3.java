package tw.leetcode.question;

import java.util.LinkedList;

public class RomantoIntegerV3 {
	public int romanToInt(String s) {
		LinkedList<String> list = new LinkedList<>();
		LinkedList<Integer> changeVal = new LinkedList<>();
		int value = 0;
		list.add(0, "I");
		list.add(1, "V");
		list.add(2, "X");
		list.add(3, "L");
		list.add(4, "C");
		list.add(5, "D");
		list.add(6, "M");
		changeVal.add(0,1);
		changeVal.add(1,5);
		changeVal.add(2,10);
		changeVal.add(3,50);
		changeVal.add(4,100);
		changeVal.add(5,500);
		changeVal.add(6,1000);
		
		for(int i=0;i<s.length()-1;i++) {
			if(list.indexOf(s.substring(i, i+1)) < list.indexOf(s.substring(i+1, i+2))) {
				value= value-changeVal.get(list.indexOf(s.substring(i, i+1))); 
			}else {
				value= value+changeVal.get(list.indexOf(s.substring(i, i+1)));
			}
		}
		value= value+changeVal.get(list.indexOf(s.substring(s.length()-1, s.length())));

		return value;
	}
}
