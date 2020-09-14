

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program2 {

        public static void main(String[] args) throws IOException {

                int num;
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter  number : ");
                num = Integer.parseInt(br.readLine());

		  
         		for(int i = 1; i <= num; i++) {
             			
				if (num % i == 0) {
                			
					 System.out.print(i + " ");
             		}
         	}
	}
}
