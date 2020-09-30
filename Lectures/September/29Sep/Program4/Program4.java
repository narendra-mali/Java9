

import java.io.*;

class Program4 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());

		int[] iarr = new int[x];

		for(int i = 0; i < iarr.length; i++) {
			
			System.out.print("Enter element = ");		
			iarr[i] = Integer.parseInt(br.readLine()); 
		}

		System.out.println("Array elements : ");          
		for(int i = 0; i < x; i++) {

                	System.out.println(iarr[i]);
                }

	}
}
