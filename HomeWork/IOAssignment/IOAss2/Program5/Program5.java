

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program5 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter number : ");
                int num = Integer.parseInt(br.readLine());
	
		if(num % 5 == 0 && num % 10 == 0)
		
			System.out.println(num + " is divisible by both 5 and 10");

		else
			 System.out.println(num + " is not divisible by both 5 and 10");
	}
}
