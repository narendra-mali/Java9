

import java.util.Scanner;

class Pattern {

	public static void main(String[] args) {
   
		int n = 6; 
		for (int i = 1; i <= n; i++) { 
            
			int ch = 65; 
			for (int j = 1; j <= i; j++) { 
                
				System.out.print(((char)ch) + " "); 
                		ch++; 
            		} 
        
			System.out.println(); 
        	} 
    	}
}
