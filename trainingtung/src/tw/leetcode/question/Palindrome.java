package tw.leetcode.question;

public class Palindrome {
	 public boolean isPalindrome(int x) {
	     boolean isPalindrome =true; 
		 String str =Integer.toString(x); 
	     
		 
		 for(int i=0;i<str.length()/2;i++) {
			 String a =str.substring(i, i+1); 
			 String b =str.substring(str.length()-(i+1), str.length()-i); 
			 if(a.equals(b)) {
				 isPalindrome = true;
//				 System.out.println("ok");
			 }else {
				 isPalindrome = false;
//				 System.out.println("xx");
				 break;
			 }
		 }
//		 String a =str.substring(0, 1);
		 
		 
		 return isPalindrome;
	    }

}
