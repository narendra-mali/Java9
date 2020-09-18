

import java.io.*;

class Program1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your choice \n1-Integer\n2-String\n");
		int ch = Integer.parseInt(br.readLine());
		switch(ch) {
		
			case 1:
			        System.out.println("Enter Number = ");
				int n = Integer.parseInt(br.readLine());	
				System.out.println("Integer = " + n);
				break;

			case 2:
				System.out.println("Enter String = ");
				String str = br.readLine();
				System.out.println("String = " + str);
                                break;

			default:
				System.out.println("Wrong choice!");
		}
	}
}
