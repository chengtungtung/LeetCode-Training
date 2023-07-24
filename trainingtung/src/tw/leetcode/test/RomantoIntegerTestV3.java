package tw.leetcode.test;

import java.util.HashMap;
import java.util.LinkedList;

public class RomantoIntegerTestV3 {

	public static void main(String[] args) {
		String s = "MCMXCIV";
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
		
		System.out.println(value);
		
//		String change=s.replace('I', '1').replace('V', '2')
//				.replace('X', '3').replace('L', '4').replace('C', '5')
//				.replace('D', '6').replace('M', '7').concat("0");
//		System.out.println(change);
//
//		for(int i =0 ;i<change.length()-1;i++) {
//			if(Integer.parseInt(change.substring(i, i+1)) <Integer.parseInt(change.substring(i+1, i+2))) {
//				if(change.substring(i, i+1).equals("1")) {
//					value=value-1;
//				}else if(change.substring(i, i+1).equals("2")){
//					value=value-5;
//				}else if(change.substring(i, i+1).equals("3")){
//					value=value-10;
//				}else if(change.substring(i, i+1).equals("4")){
//					value=value-50;
//				}else if(change.substring(i, i+1).equals("5")){
//					value=value-100;
//				}else if(change.substring(i, i+1).equals("6")){
//					value=value-500;
//				}else if(change.substring(i, i+1).equals("7")){
//					value=value-1000;
//				}else {
//					System.out.println("錯誤");
//				}
//			}else {
//				if(change.substring(i, i+1).equals("1")) {
//					value=value+1;
//				}else if(change.substring(i, i+1).equals("2")){
//					value=value+5;
//				}else if(change.substring(i, i+1).equals("3")){
//					value=value+10;
//				}else if(change.substring(i, i+1).equals("4")){
//					value=value+50;
//				}else if(change.substring(i, i+1).equals("5")){
//					value=value+100;
//				}else if(change.substring(i, i+1).equals("6")){
//					value=value+500;
//				}else if(change.substring(i, i+1).equals("7")){
//					value=value+1000;
//				}else {
//					System.out.println("錯誤2");
//				}
//				
//			}
//		}
//		System.out.println(value);

	}

}
