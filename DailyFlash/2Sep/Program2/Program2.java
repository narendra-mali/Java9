

import java.io.*;

class Program2 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int num1 = Integer.parseInt(br.readLine());
                int num2 = Integer.parseInt(br.readLine());

     		if(num1 < num2)

			System.out.println("The Minimum number amongst " + num1 + " & " + num2 + " is " + num1);

		else
			System.out.println("The Minimum number amongst " + num1 + " & " + num2 + " is " + num2);

        }
}
