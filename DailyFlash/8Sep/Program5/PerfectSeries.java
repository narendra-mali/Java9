

import java.io.*;

class PerfectSeries {

	public static void main(String args[])throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the number = ");
		int num = Integer.parseInt(br.readLine());

		int sum = 0;
		System.out.println("The Series of all perfect numbers from 1 to " + num + " is = ");
		for(int i = 1; i <= num ;i++) {

			sum = 0;
			for(int j = 1 ; j <= i/2 ; j++){

				if(i % j == 0)
					
					sum = sum + j;
			}

			if(i == sum || i == 1)
				System.out.print(i + " ");
		}


	}

}
