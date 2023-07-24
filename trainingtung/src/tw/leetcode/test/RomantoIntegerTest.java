package tw.leetcode.test;

public class RomantoIntegerTest {

	public static void main(String[] args) {
		String s ="MCMXCIV";
		int countI = 0;
		int countV = 0;
		int countX = 0;
		int countL = 0;
		int countC = 0;
		int countD = 0;
		int countM = 0;
		int value = 0;
		
		String change=s.replace('I', '1').replace('V', '2')
				.replace('X', '3').replace('L', '4').replace('C', '5')
				.replace('D', '6').replace('M', '7').concat("0");
		System.out.println(change);

		for(int i =0 ;i<change.length()-1;i++) {
			if(Integer.parseInt(change.substring(i, i+1)) <Integer.parseInt(change.substring(i+1, i+2))) {
				if(change.substring(i, i+1).equals("1")) {
					value=value-1;
				}else if(change.substring(i, i+1).equals("2")){
					value=value-5;
				}else if(change.substring(i, i+1).equals("3")){
					value=value-10;
				}else if(change.substring(i, i+1).equals("4")){
					value=value-50;
				}else if(change.substring(i, i+1).equals("5")){
					value=value-100;
				}else if(change.substring(i, i+1).equals("6")){
					value=value-500;
				}else if(change.substring(i, i+1).equals("7")){
					value=value-1000;
				}else {
					System.out.println("錯誤");
				}
			}else {
				if(change.substring(i, i+1).equals("1")) {
					value=value+1;
				}else if(change.substring(i, i+1).equals("2")){
					value=value+5;
				}else if(change.substring(i, i+1).equals("3")){
					value=value+10;
				}else if(change.substring(i, i+1).equals("4")){
					value=value+50;
				}else if(change.substring(i, i+1).equals("5")){
					value=value+100;
				}else if(change.substring(i, i+1).equals("6")){
					value=value+500;
				}else if(change.substring(i, i+1).equals("7")){
					value=value+1000;
				}else {
					System.out.println("錯誤2");
				}
				
			}
		}
		System.out.println(value);
		
		
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == 'I') {
//				countI++;
//			}
//			if (s.charAt(i) == 'V') {
//				countV++;
//			}
//			if (s.charAt(i) == 'X') {
//				countX++;
//			}
//			if (s.charAt(i) == 'L') {
//				countL++;
//			}
//			if (s.charAt(i) == 'C') {
//				countC++;
//			}
//			if (s.charAt(i) == 'D') {
//				countD++;
//			}
//			if (s.charAt(i) == 'M') {
//				countM++;
//			}
//
//		}
//
//		for (int i = 0; i < s.length() - 1; i++) {
//			System.out.println(s.substring(i, i + 2));
//			if (s.substring(i, i + 2).equals("IV")) {
//				countI--;
//				countV--;
//				value = value + 4;
//			}
//			if (s.substring(i, i + 2).equals("IX")) {
//				countI--;
//				countX--;
//				value = value + 9;
//			}
//			if (s.substring(i, i + 2).equals("XL")) {
//				countX--;
//				countL--;
//				value = value + 40;
//			}
//			if (s.substring(i, i + 2).equals("XC")) {
//				countX--;
//				countC--;
//				value = value + 90;
//			}
//			if (s.substring(i, i + 2).equals("CD")) {
//				countC--;
//				countD--;
//				value = value + 400;
//			}
//			if (s.substring(i, i + 2).equals("CM")) {
//				countC--;
//				countM--;
//				value = value + 900;
//			}
//		}
//		value = value + countI * 1 + countV * 5 + countX * 10 + countL * 50 + countC * 100 + countD * 500
//				+ countM * 1000;
//		System.out.println(value);
	}

}
