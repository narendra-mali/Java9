

import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Float f = Float.parseFloat(br.readLine());

		if(f == 1.1) 
			System.out.println(true);

		else
			System.out.println(false);
	}
}
