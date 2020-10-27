

import java.io.*;

class WhiteSpace {

	public static void main(String[] args) throws IOException {

		String sb1 = "Core2Web   Technologies  and Biencaps";
		char[] str = sb1.toCharArray();
	        StringBuffer sb2= new StringBuffer();
        	
		for (int i = 0; i < str.length; i++) {  
        
		    	if ((str[i] != ' ') && (str[i] != '\t')) {  
                		sb2.append(str[i]);  
            		}  
        	}  
        
		String sp = sb2.toString();  
        
		System.out.println(sp);  
	}
}
