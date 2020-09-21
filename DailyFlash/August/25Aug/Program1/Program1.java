

import java.io.*;

class Program1 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number : ");
                int num = Integer.parseInt(br.readLine());

		System.out.println(num);
	}
}
