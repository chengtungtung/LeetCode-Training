package tw.leetcode.test;

public class PlusOnetest {

	public static void main(String[] args) {
		// Input: digits = [1,2,3]
		// Output: [1,2,4]
		// Input: digits = [4,3,2,1]
		// Output: [4,3,2,2]
		// Input: digits = [9]
		// Output: [1,0]
		int[] digits = { 9,8,7,6,5,4,3,2,1,0 };
		int temp = 0;
		for (int i = 0; i < digits.length; i++) {
			temp = digits[i] + temp * 10;
			System.out.println(temp);
		}
		temp += 1;
		
		int[] result = new int[Integer.toString(temp).length()];
		for (int i = result.length-1; i>=0 ; i--) {
			result[i] = temp % 10;
			temp /= 10;
		}

		for (int a : result) {
			System.out.print(a);
		}

	}

}
