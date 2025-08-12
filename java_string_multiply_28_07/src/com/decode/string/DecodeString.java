package com.decode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecodeString {
	
	static int decodeHelper(String digits, int index)
    {

        int n = digits.length();

        // Base case: If we reach the end of the string,
        // return 1 as it signifies a valid decoding.
        if (index >= n) {
            return 1;
        }

        int ways = 0;

        // Single-digit decoding: check if current digit is
        // not '0'.
        if (digits.charAt(index) != '0') {
            ways = decodeHelper(digits, index + 1);
        }

        // Two-digit decoding: check if next two digits are
        // valid.
        if ((index + 1 < n)
            && ((digits.charAt(index) == '1'
                 && digits.charAt(index + 1) <= '9')
                || (digits.charAt(index) == '2'
                    && digits.charAt(index + 1) <= '6'))) {

            ways += decodeHelper(digits, index + 2);
        }

        return ways;
    }

    // Function to count decoding ways for the
    // entire string.
    static int countWays(String digits)
    {
        return decodeHelper(digits, 0);
    }

    public static void main(String[] args)
    {

        String digits = "121";

        System.out.println(countWays(digits));
    }
	
	
	
	
	
	
	/*
	
	public static void main(String args[]) {
		String st="226";
//		MyReturnValues result1=new MyReturnValues();
//	
//		result1=findSubString(st);
//		System.out.println("Solution String is "+result1.value2 +" Colllection " +result1.value1);
//
//		
//		 st="226";
//		MyReturnValues result2=new MyReturnValues();
//	
//		result2=findTwoCharacterSubString(st);
//		System.out.println("Solution String is "+result2.value2 +" Colllection " +result2.value1);

		
		 st="11106";
		MyReturnValues result3=new MyReturnValues();
	
		result3=findTwoCharacterSubString(st);
		System.out.println("Solution String is "+result3.value2 +" Colllection " +result3.value1);
//
//		String st="12";
//		MyReturnValues result=new MyReturnValues();
//	
//		result=findSubString(st);
//		System.out.println("Solution String is "+result.value2 +" Colllection " +result.value1);

	}
	
	int[] numDecodings(s: string): number {
		int dp[] = new int[s.length + 1];
		
		for (int i = 0; i < dp.length; i++)
            dp[i]=0;
		
		 // let dp = Array.from({ length: s.length + 1 }, () => 0);

		  dp[0] = 1;
		  dp[1] = (s[0] == '0') ? 0 : 1;

		  for (let i = 2; i <= s.length; i++) {
		    final var prevDigit = s[i - 1];
		    final var twoPrevDigits = s.slice(i - 2, i);
		    if (+prevDigit != 0) {
		      dp[i] += dp[i - 1];
		    }

		    if (10 <= +twoPrevDigits && +twoPrevDigits <= 26) {
		      dp[i] += dp[i - 2];
		    }
		  }

		  return dp[s.length];
		}
	
	static MyReturnValues findSubString(String str) {
		String resultString="";
		MyReturnValues result=new MyReturnValues();
		
		//List<Integer> myValueList = new ArrayList<Integer>();
		
		
		if(str.contains("0")) {
			
		}
		else {
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				
				int intValue = Character.getNumericValue(ch);
				result.value1.add(intValue);
				resultString+=getAlphabet(intValue);
				
			}
		}
		result.value2=resultString;
		return result;
		
		
		
	}
	static MyReturnValues findTwoCharacterSubString(String str) {
		String resultString="";
		MyReturnValues result=new MyReturnValues();
		
		//List<Integer> myValueList = new ArrayList<Integer>();
		
		int ascVal=0;
		
			for(int i=0;i<((str.length() % 2 == 0)?str.length()-1:str.length());i++) {
				char chFirst=str.charAt(i);
				char chSecond='0';
				if((i+1) < str.length()) {
					
					chSecond=str.charAt(i+1);
					
					
				}
				
				if(Character.getNumericValue(chFirst)!=0 && i+1< str.length())
				{
					ascVal=Character.getNumericValue(chFirst) * 10 + Character.getNumericValue(chSecond);
					result.value1.add(ascVal);
					resultString+=getAlphabet(ascVal);
					result.value2=resultString;
					i++;
				}
				else if(Character.getNumericValue(chFirst)== 0 && Character.getNumericValue(chSecond)!=0){
					continue;
				}
				else if(Character.getNumericValue(chFirst)!= 0 && Character.getNumericValue(chSecond)==0){
					ascVal= Character.getNumericValue(chFirst);
					result.value1.add(ascVal);
					resultString+=getAlphabet(ascVal);
					result.value2=resultString;
					i++;
				}
				else {
					i++;
				}
				
				
				
			}
		
		
		return result;
		
		
		
	}
	
	static int validSubString(String str) {
		
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
	
	static char getAlphabet(int value) {
		switch(value) {
		case 1: 
			return 'A';
		case 2: 
			return 'B';
		case 3: 
			return 'C';
		case 4: 
			return 'D';
		case 5: 
			return 'E';
		case 6: 
			return 'F';
		case 7: 
			return 'G';
		case 8: 
			return 'H';
		case 9: 
			return 'I';
		case 10: 
			return 'J';
		case 11: 
			return 'K';
		case 12: 
			return 'L';
		case 13: 
			return 'M';
		case 14: 
			return 'N';
		case 15: 
			return 'O';
		case 16: 
			return 'P';
		case 17: 
			return 'Q';
		case 18: 
			return 'R';
		case 19: 
			return 'S';
		case 20: 
			return 'T';
		case 21: 
			return 'U';
		case 22: 
			return 'V';
		case 23: 
			return 'W';
		case 24: 
			return 'X';
		case 25: 
			return 'Y';
		case 26: 
			return 'Z';
			default:
				return '0';
		}*/
	}




