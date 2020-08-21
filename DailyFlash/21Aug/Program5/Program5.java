

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program5 {

	public static void main(String[] args) throws IOException {

		char ch;
       		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Character = ");
                ch = (char)br.read();
		
		int val = (int)ch;
		System.out.println("The ASCII value of " + ch + " is : " + val);
	}
}
