

import java.io.*;

class Program5 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int num1 = Integer.parseInt(br.readLine());
                int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());

                if(num1 > num2 && num1 > num3)

                        System.out.println("The Maximum number amongst " + num1 + " " + num2 + " & " + num3 + " is " + num1);

		else if(num2 > num1 && num2 > num3)

                        System.out.println("The Maximum number amongst " + num1 + " " + num2 + " & " + num3 + " is " + num2);

                else
                        System.out.println("The Maximum number amongst " + num1 + " " + num2 + " & " + num3 + " is " + num3);

        }
}

