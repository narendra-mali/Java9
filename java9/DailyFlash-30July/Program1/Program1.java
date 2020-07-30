

import java.util.*;

class Operations {

	public static void main(String[] args) {
	
		int num1, num2;
		float res = 0;
		char ch;
        	
		Scanner sc = new Scanner(System.in);
		
	        System.out.println("Enter first number = ");
		num1 = sc.nextInt();
	        System.out.println("Enter second number = ");
        	num2 = sc.nextInt();

		System.out.println("\n + \n - \n * \n * \n % ");

		System.out.println("Enter your choice = ");
        	ch = sc.next().charAt(0);;

		switch(ch) {
            
			case '+' :
            			res = num1 + num2;
                		break;

            		case '-' :
            			res = num1 - num2;
                		break;

            		case '*' :
            			res = num1 * num2;
                		break;

            		case '/' :
            			res = num1 / num2;
                		break;
		
			case '%' :
                                res = num1 % num2;
                                break;

            		default:
                		System.out.printf("Wrong choice");
                		break;
        	}
		
		System.out.println("Result = " + res);
       }
}
