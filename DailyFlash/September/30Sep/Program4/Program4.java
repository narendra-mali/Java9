

import java.io.*;

class AgeArr {

	public static void main(String[] args ) throws IOException {

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int age = Integer.parseInt(br.readLine());
	
		int i = 0;
		int[] iarr = new int[age];
		int max = iarr[0];

		for(i = 0; i < age; i++) {

			System.out.print("Enter Age = ");
			iarr[i] = Integer.parseInt(br.readLine());
			
			if(iarr[i] > max)

				max = iarr[i];
		}
		System.out.println("Maximum age is = " + max);

	}
}
