

import java.util.Scanner;

class Program11 {

    public static void main(String[] args) {
	    
	    int num, sum = 0;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number = ");
	    num = sc.nextInt();

	    System.out.println("Perfect Divisors of " + num + " are = ");
	    for (int i = 2; i < num; i++) {
		     
		     if (num % i == 0) 
                	System.out.print(i + " "); 
    		} 

    	}
}
  
