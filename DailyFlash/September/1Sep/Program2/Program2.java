

import java.io.*;

class Program2 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int num1 = Integer.parseInt(br.readLine());
                int num2 = Integer.parseInt(br.readLine());

                System.out.println("Before Swap ");
	        System.out.print(num1 + " " + num2);
                
                int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("\nAfter Swap ");
                System.out.println(num1 + " " + num2);
        }
}
