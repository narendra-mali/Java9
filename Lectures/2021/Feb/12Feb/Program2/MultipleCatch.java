

import java.io.*;

class MultipleCatch {

	public static void main(String[] args) {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
		
			System.out.println(10/0);
			br.close();
			System.out.println(br.readLine());
		}
		catch(ArithmeticException ae) {
		
			System.out.println("Arithmetic Exception");
		}
		catch(IOException ie) {
		
			System.out.println("IOException");
		} 
	}
}

/*
 * Arithmetic Exception
 */
