

import java.io.*;

class MulDiv {

        public static void main(String[] args) throws IOException {

                int mul,div;
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter 1st number = ");
                int num1 = Integer.parseInt(br.readLine());

                System.out.println("Enter 2nd number = ");
                int num2 = Integer.parseInt(br.readLine());

                mul = num1 * num2;

                if(num1 < num2) {

                        div = num2 / num1;
                }

                else
                        div = num1 / num2;

                System.out.println("Multiplication is = " + mul);
                System.out.println("Division is = " + div);
        }
}

