package tw.leetcode.question;

public class Sqrt {
	public int mySqrt(int x) {
        int output = 0;
		for (long i = 1; i > 0; i++) {
			if (i * i > x) {
				break;
			} else {
				output = (int)i;
			}
		}
        return output;
    }

}
