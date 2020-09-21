

import java.io.*;

class Program2 {

        public static void main(String arg[]) throws IOException{

                int sum = 0;
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		int fact = 1;
		
		for (int i = start; i <= end; i++) {
			
			fact = fact * i;
			System.out.println("The Factorial of " + i + " = " + fact);
		}

	}
}
