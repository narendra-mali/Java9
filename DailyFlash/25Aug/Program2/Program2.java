

import java.io.*;

class Program2 {

	public static void main(String[] args) throws IOException {
	
		int sum = 0;
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i <= num; i++) {
		
			sum = sum + i;
		}

		System.out.println("The sum number up to " + num + " : " + sum);

	}
}
