

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start number : ");
  		int num1 = Integer.parseInt(br.readLine());
		System.out.println("Enter end number : ");
                int num2 = Integer.parseInt(br.readLine());

		int i = 0;
       		int num = 0;
       	        String  primeNum = "";
       		
		for (i = num1; i <= num2; i++) {
          	
			int cnt = 0;

          		for(num = i; num >= 1; num--) {
             			
				if(i % num == 0)
 					cnt = cnt + 1;
				
	  		}
	  		
			if (cnt == 2) 
	     			primeNum = primeNum + i + " " ;
	
       		}
	
       
		System.out.println("Prime numbers from " + num1 + " to " + num2 + " are :");
       		System.out.println(primeNum);
   }
}
