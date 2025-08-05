package com.decode.string;

public class DecodeString {
	
	public static void main(String args[]) {
		String st="12";
		
		
		findSubString(st);
		
		
//		System.out.println(intValue);
	}
	
	static void findSubString(String str) {
		
		
		
	}
	
	int validSubString(String str) {
		
		char digitChar=str.charAt(0);
		int intValue = Character.getNumericValue(digitChar);
		if(intValue == 0) {
			return 0;
		}
		else
		{
			return 1;
		}
	}

}
