
import java.io.*;

class IOExceptionDemo {

	public static void main(String[] args) {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
	}
}

/*
 * IOExceptionDemo.java:10: error: unreported exception IOException; must be caught or declared to be thrown
		int a = Integer.parseInt(br.readLine());
		                                    ^
   1 error
*/
