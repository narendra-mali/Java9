

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program1 {

	public static void main(String[] args) throws IOException {

		int num1,num2,ch;
       		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter 1st number : ");
                num1 = Integer.parseInt(br.readLine());

		System.out.print("Enter 2nd number : ");
                num2 = Integer.parseInt(br.readLine());

		System.out.println("\n1- Addition\n2- Subtraction \n3- Multiplication\n4- Division");
		System.out.println("Enter your choice : ");
                ch = Integer.parseInt(br.readLine());

		switch(ch) {
		
			case 1 :
				System.out.println("Addition of " + num1 + " and " + num2 + " is = " + (num1 + num2));
				break;

			case 2 :
				System.out.println("Subtraction of " + num1 + " and " + num2 + " is = " + (num1 - num2));
                                break;

			case 3 :
				System.out.println("Multilpication of " + num1 + " and " + num2 + " is = " + (num1 * num2));
				break;

			case 4 :
				System.out.println("Division of " + num1 + " and " + num2 + " is = " + (num1 / num2));
                                break;

		}
	}
}
