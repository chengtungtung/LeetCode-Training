package tw.leetcode.test;

public class Sqrttest {

	public static void main(String[] args) {
		// Input: x = 4
		// Output: 2
		int x = 2147395600;
		int output = 0;
		for (long i = 1; i > 0; i++) {
			if (i * i > x) {
				break;
			} else {
				output = (int)i;
			}
		}

		System.out.println(output);

	}

}
