

import java.io.*;

class Arithmetic {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter two numbers ");

		int a = Integer.parseInt(br1.readLine());
		
		String x = br1.readLine();

		int b = Integer.parseInt(x);

		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
		System.out.println("a % b = " + (a%b));

	}
}
