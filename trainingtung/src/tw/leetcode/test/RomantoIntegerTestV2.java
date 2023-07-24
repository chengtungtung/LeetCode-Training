package tw.leetcode.test;

import java.util.LinkedList;

public class RomantoIntegerTestV2 {

	public static void main(String[] args) {
		String s = "MCMXCIV";
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
