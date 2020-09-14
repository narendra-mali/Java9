

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program4 {

	public static void main(String[] args) throws IOException {

		int max;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1st number : ");
  		int num1 = Integer.parseInt(br.readLine());

		System.out.println("Enter 2nd number : ");
  		int num2 = Integer.parseInt(br.readLine());

		System.out.println("Enter 3rd number :");
  		int num3 = Integer.parseInt(br.readLine());

		if (num1 < num2) {
         	
		 	if (num2 < num3)
                		System.out.println(num1 + " " + num2 + " " + num3);
                        else
                    		System.out.println(num1 + " " + num3 + " " + num2);
        	}

        	else if (num2 < num1){
                	
			if (num1 < num3)
                		System.out.println(num2 + " " + num1 + " " + num3);
                    	else
                    		System.out.println(num2 + " " + num3 + " " + num1);
        	}

        	else if (num3 < num1){
                	
			if (num2 < num1)
                		System.out.println(num3 + " " + num1 + " " + num2);
                    	else
                    		System.out.println(num3 + " " + num2 + " " + num1);

        	}
	}
}
