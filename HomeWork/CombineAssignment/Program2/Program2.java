

import java.util.Scanner;

class Program2 {

    public static void main(String[] args) {

        int num1, num2;

        Scanner sc = new Scanner(System.in);
        
	System.out.print("Enter 1st number = ");
        num1 = sc.nextInt();

        System.out.print("Enter 2nd number = ");
        num2 = sc.nextInt();

        while (num1 != num2) {
        
		if(num1 > num2)
                	num1 = num1 - num2;
            	else
                	num2 = num2 - num1;
        }

        System.out.println("GCD = " + num2);
    }

}
