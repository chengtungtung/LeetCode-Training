package tw.leetcode.question;

public class RomantoIntegerV2 {
	public int romanToInt(String s) {
		int value = 0;
		String change=s.replace('I', '1').replace('V', '2')
				.replace('X', '3').replace('L', '4').replace('C', '5')
				.replace('D', '6').replace('M', '7').concat("0");
		

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
				}else{
					value=value-1000;
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
				}else{
					value=value+1000;
				}
				
			}
		}


		return value;
	}
}
