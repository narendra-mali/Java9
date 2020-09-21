

import java.io.*;

class AddSub {

	public static void main(String[] args) throws IOException {
	
		int add,sub;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1st number = ");
		int num1 = Integer.parseInt(br.readLine());

		System.out.println("Enter 2nd number = ");
                int num2 = Integer.parseInt(br.readLine());

		add = num1 + num2;

		if(num1 < num2) {
		
			sub = num2 - num1;
		}

		else
			sub = num1 - num2;

		System.out.println("Addition is = " + add);
		System.out.println("Subtraction is = " + sub);
	}
}
