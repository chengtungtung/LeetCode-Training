package tw.leetcode.test;

public class LengthofLastWordtest {

	public static void main(String[] args) {
		//
		String s = "a ";
		String s1 = "   fly me   to   the moon  ";
		int count = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				count++;
				if(i==0) {
					break;
				}else if (s.charAt(i - 1) == ' ') {
					break;
				}else {}
			}
		}

		System.out.println(count);

	}

}
