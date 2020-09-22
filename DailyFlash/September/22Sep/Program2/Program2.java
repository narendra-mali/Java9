

import java.io.*;

class Program2 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int sum = 0;

		while(true) {
		
			int num = Integer.parseInt(br.readLine());
			sum = sum + num;

			if(num > 50) 
				break;
		}
		
		System.out.println("Sum = " + sum);
	}
}
