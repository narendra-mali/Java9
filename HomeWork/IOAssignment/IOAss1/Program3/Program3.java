

import java.io.*;

class Program3 {

        public static void main(String[] args) throws IOException {

                InputStreamReader ip = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(ip);

                System.out.println("Enter 1st number : ");
                double num1 = Double.parseDouble(br.readLine());

		System.out.println("Enter 2nd number : ");
                double num2 = Double.parseDouble(br.readLine());

		System.out.println("Addition of " + num1 + " and " + num2 + " is = " + (num1 + num2));
		System.out.println("Subtraction of " + num1 + " and " + num2 + " is = " + (num1 - num2));
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is = " + (num1 * num2));
		System.out.println("Division of " + num1 + " and " + num2 + " is = " + (num1 / num2));
		
	}
}
