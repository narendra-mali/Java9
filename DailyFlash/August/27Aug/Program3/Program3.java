

import java.io.*;

class CubeSq {

        public static void main(String[] args) throws IOException {

                int cube1,sq1,cube2,sq2;
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter 1st number = ");
                int num1 = Integer.parseInt(br.readLine());

                System.out.println("Enter 2nd number = ");
                int num2 = Integer.parseInt(br.readLine());

                sq1 = num1 * num1;
		sq2 = num2 * num2;

		cube1 = num1 * num1 * num1;
		cube2 = num2 * num2 * num2;

		int add = cube1 + cube2;
		int sub = sq1 - sq2;

                System.out.println("Addition of " + cube1 + " & " + cube2 + " = " + add);
                System.out.println("Subtraction of " + sq1 + " & " + sq2 + " = " + sub);
        }
}

