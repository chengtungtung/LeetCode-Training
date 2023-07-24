package tw.leetcode.test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ValidParenthesesTest {

	public static void main(String[] args) {
		//
		LinkedList<Character> temp = new LinkedList<>();
		HashMap<Character, Character> list = new HashMap<>();
		list.put('(', ')');
		list.put('{', '}');
		list.put('[', ']');

		String s = "[[[]";
		String s2 = "{[[]]}";
		String s3 = "{}()";
		String s4 = ")(()";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				temp.add(s.charAt(i));
				System.out.printf("第%d圈已加入:%s\n", i, s.charAt(i));
				if (i == s.length() - 1)
					System.out.println("結尾錯誤");
			} else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
				if (temp.size() == 0) {
					System.out.println("開頭錯誤");
					break;
				} else if (s.charAt(i) == list.get(temp.getLast())) {
					temp.removeLast();

					if (temp.size() == 0) {
						System.out.println("正確");
					} else {
						System.out.println("錯誤因為有剩");
					}
				} else {
					System.out.println("有錯誤");
					break;
				}
			} else {
				System.out.println("不是括號");
			}

		}

//		for(int i=0;i<s.length()-1;i++) {
//			if(i%2==0) {
//				if(s.substring(i, i+1).equals(temp1.charAt(0))) {
//					if(s.substring(i+1, i+2).equals(temp1.charAt(1))) {
//						System.out.println("ok");
//					}else {
//						System.out.println("xx1");
//					}
//				}else if(s.substring(i, i+1).equals(temp1.charAt(2))){
//					if(s.substring(i+1, i+2).equals(temp1.charAt(3))) {
//						System.out.println("ok");
//					}else {
//						System.out.println("xx2");
//					}
//				}else if(s.substring(i, i+1).equals(temp1.charAt(4))){
//					if(s.substring(i+1, i+2).equals(temp1.charAt(5))) {
//						System.out.println("ok");
//					}else {
//						System.out.println("xx3");
//					}
//					
//				}else {
//					System.out.println("xx4");
//				}
//				System.out.println(s.substring(i+1, i+2));
//			}
//		}
//		

	}

}
