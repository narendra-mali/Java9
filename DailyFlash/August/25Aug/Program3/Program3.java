

import java.io.*;

class Program3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		if(num % 2 == 0) {

			 System.out.println(num + " is an Even number");
		}

		else
			System.out.println(num + " is an Odd number");

	}
}
