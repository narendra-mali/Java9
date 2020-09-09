


import java.io.*;

class GCD {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		int rem,temp;

		if(num1 > num2) {

			rem = num1 % num2;
		}
		else { 
			rem = num2 % num1;
		} 

		temp = rem;

		while(rem != 0) {

			temp = rem;

			if(num1 > num2) {

				rem = num2 % rem;
				num2 = temp;
			}
			else {
				rem = num1 % rem;
				num1  = temp;
			}
		}

		if(rem == 0) {

			if(num1 > num2) {

				System.out.println("GCD of " + num1 + " & " + num2 + " = " + num2);
			}
			else {

				System.out.println("GCD of " + num1 + " & " + num2 + " = " +  num1);
			}
		}
		
		else {

			System.out.println("GCD of " + num1 + " & " + num2 + " = " + temp);
		}
	}
}
