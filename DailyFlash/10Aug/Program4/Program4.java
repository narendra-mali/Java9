

import java.util.Scanner;

class Factorial {

        public static void main(String[] args) {

                int num;

                System.out.println("Enter Number = ");

                Scanner sc = new Scanner(System.in);
                num = sc.nextInt();

                for(int i = 1; i <= num; i++){
		
			int fact = 1;
			for(int j = 1; j < i; j++) {
			
				fact = fact * j;
			}
			System.out.println("Factorial of " + i + " = " + fact);
		}
	
        }
}

