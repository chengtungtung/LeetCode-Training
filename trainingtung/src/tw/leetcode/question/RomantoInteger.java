package tw.leetcode.question;

public class RomantoInteger {
	public int romanToInt(String s) {
		int countI = 0;
		int countV = 0;
		int countX = 0;
		int countL = 0;
		int countC = 0;
		int countD = 0;
		int countM = 0;
		int value = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				countI++;
			}
			if (s.charAt(i) == 'V') {
				countV++;
			}
			if (s.charAt(i) == 'X') {
				countX++;
			}
			if (s.charAt(i) == 'L') {
				countL++;
			}
			if (s.charAt(i) == 'C') {
				countC++;
			}
			if (s.charAt(i) == 'D') {
				countD++;
			}
			if (s.charAt(i) == 'M') {
				countM++;
			}

		}

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.substring(i, i + 2).equals("IV")) {
				countI--;
				countV--;
				value = value + 4;
			}
			if (s.substring(i, i + 2).equals("IX")) {
				countI--;
				countX--;
				value = value + 9;
			}
			if (s.substring(i, i + 2).equals("XL")) {
				countX--;
				countL--;
				value = value + 40;
			}
			if (s.substring(i, i + 2).equals("XC")) {
				countX--;
				countC--;
				value = value + 90;
			}
			if (s.substring(i, i + 2).equals("CD")) {
				countC--;
				countD--;
				value = value + 400;
			}
			if (s.substring(i, i + 2).equals("CM")) {
				countC--;
				countM--;
				value = value + 900;
			}
		}
		value = value + countI * 1 + countV * 5 + countX * 10 + countL * 50 + countC * 100 + countD * 500
				+ countM * 1000;

		return value;
		
	}
}
