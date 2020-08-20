

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program3 {

	public static void main(String[] args) throws IOException {
        
		int year;
       		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             
                System.out.print("Enter year:");
                year = Integer.parseInt(br.readLine());
             
               if(year % 4 == 0) {
	
		       if( year % 100 == 0) {
             
			       if ( year % 400 == 0)
                    
				        System.out.println(year + " is a leap year.");
                
			       else
                    			 System.out.println(year + " is not a leap year.");
           		}
            
		       else
                		 System.out.println(year + " is a leap year.");
        	}
        	else
            		 System.out.println(year + " is not a leap year.");

        }
}
