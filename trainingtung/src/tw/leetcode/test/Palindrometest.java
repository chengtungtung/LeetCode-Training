package tw.leetcode.test;

public class Palindrometest {

	public static void main(String[] args) {
		String test ="12345678";
		int test1= 12345;
		int temp = 0;
		
		while (test1 > 0) {
			temp = test1 % 10;//取餘數
			test1 = test1 / 10;
			System.out.println(temp);
			System.out.println(test1);
			
			
		}
//		 for(int i=0;i<test.length()/2;i++) {
//			 String a =test.substring(i, i+1); 
//			 String b =test.substring(test.length()-(i+1), test.length()-i);
////			 System.out.println(a);
////			 System.out.println(b);
////			 System.out.println("-----");
//			 if(a.equals(b)) {
//				 System.out.println("ok");
//			 }else {
//				 System.out.println("xx");
//				 break;
//			 }
//				 
////			 System.out.println(a);
//		 }
		
//		String res = new String();
//		for(int j=test.length()-1;j>=0;j--) {
//			res = res+ test.substring(j,j+1);
//		}
//		System.out.println(res);
//		
		
		
//		int x = 12332;
//		for (int i = 0; i < String.valueOf(x).length() / 2; i++) {
//			if (x / ((int) (Math.pow(10, i))) % 10 == x / ((int) (Math.pow(10, Integer.toString(x).length() - (i + 1))))
//					% 10) {
//				System.out.println("ok");
//			} else {
//				System.out.println("xx");
//			}
//		}
		
//		System.out.println(x%10);
//		System.out.println(x/10%10);
//		System.out.println(x/100%10);
//		System.out.println(x/(10*( -1))%10);
//		System.out.println(String.valueOf(x).length());
//		System.out.println(x/(int)(Math.pow(10, String.valueOf(x).length()-2))%10);
//		System.out.println(Math.pow(10,3));
//		System.out.println(x/((int)(Math.pow(10,1)))%10);
//		System.out.println(x/(int)(Math.pow(10, String.valueOf(x).length()-2))%10);

	}

}
