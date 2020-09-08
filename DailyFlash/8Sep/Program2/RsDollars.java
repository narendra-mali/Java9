

import java.io.*;


class RsDollars{

	public static void main(String args[])throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the amount in rupee = ");
		int rs = Integer.parseInt(br.readLine());

		System.out.println("Dollar = " + rs * 0.014); 





	}

}
