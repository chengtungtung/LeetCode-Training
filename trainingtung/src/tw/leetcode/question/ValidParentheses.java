package tw.leetcode.question;

import java.util.HashMap;
import java.util.LinkedList;

public class ValidParentheses {
	public boolean isValid(String s) {
		boolean isValid = false;
		LinkedList<Character> temp = new LinkedList<>();
		HashMap<Character, Character> list = new HashMap<>();
		list.put('(', ')');
		list.put('{', '}');
		list.put('[', ']');

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				temp.add(s.charAt(i));
				if (i == s.length() - 1) {
					isValid = false;
					break;
				}
			} else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
				if (temp.size() == 0) {
					isValid = false;
					break;
				} else if (s.charAt(i) == list.get(temp.getLast())) {
					temp.removeLast();
					if (temp.size() == 0) {
						isValid = true;
					} else {
						isValid = false;
					}

				} else {
					isValid = false;
					break;
				}

			} else {

			}

		}

		return isValid;
	}
}
