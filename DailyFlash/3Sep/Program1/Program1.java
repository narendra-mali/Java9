

import java.io.*;

class Program1 {

	public static void main(String arg[]) throws IOException{
	    
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             	int n = Integer.parseInt(br.readLine());

	    	int i = 1;
	    
		while(i<=n/2) {
	       
			if(n % i == 0) {
				
				sum = sum + i;
	       		}
	      		i++;
	    	}
	
		if(sum == n)
	
			System.out.println(n + " is a perfect number");
               
		else
			System.out.println(n + " is not a  perfect number");
	}
}
