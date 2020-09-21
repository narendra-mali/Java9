

import java.io.*;

class Calc {

        public static void main(String[] args) throws IOException {

  
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter 1st number = ");
                int num1 = Integer.parseInt(br.readLine());

                System.out.println("Enter 2nd number = ");
                int num2 = Integer.parseInt(br.readLine());

		System.out.println("Enter the sign of operation = ");
		char op = br.readLine().charAt(0);;

                if(op == '+') 
			System.out.println("Addition of " + num1 + " & " + num2 + " = " + (num1 + num2));
		else if(op == '-') 
			 System.out.println("Subtraction of " + num1 + " & " + num2 + " = " + (num1 - num2));
                else if(op == '*')
			 System.out.println("Multiplication of " + num1 + " & " + num2 + " = " + (num1 * num2));
                else if(op == '/')
			 System.out.println("Divison of " + num1 + " & " + num2 + " = " + (num1 / num2));
		else
			System.out.println("Invalid operation");
		
 	}
}
