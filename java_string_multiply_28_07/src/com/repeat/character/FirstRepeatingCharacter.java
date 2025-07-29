package com.repeat.character;

public class FirstRepeatingCharacter {
	
	public static void main(String args[]) {
		 String str = "Subhasis";
		 String result=firstRepChar(str);

		 	if(result.equals( "-1"))
		 		System.out.println("No Repeating character found");
		 	else
	        System.out.println("The First Repeating character is = "+result);
	        
		
	}
	
	public static String firstRepChar(String st)
    {
        // Get the size of the input string
        int n = st.length();
        
        //convert the string into Lowercase
        
        st=st.toLowerCase();
        

        // Iterate through each character in the string
        for (int i = 0; i < n; i++) {

            char ch = st.charAt(i);
            for (int j = 0; j < i; j++) {
                if (ch == st.charAt(j)) {

                   
                    return Character.toString(st.charAt(i));
                }
            }
        }

        // If no repeating character is found, return "-1"
        return "-1";
    }


}
