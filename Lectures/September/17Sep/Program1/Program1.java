

import java.io.*;

class IOExceptionDemo {

	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String input1 = br.readLine();
		System.out.println(input1);

		String input2 = br.readLine();
                System.out.println(input2);

		br.close();

	//	isr.close();		//Error
		br.readLine();		//Error
	}
}
