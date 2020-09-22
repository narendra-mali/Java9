

import java.io.*;

class Program3 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader brOne = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader brTwo = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your Name = ");
		String name = brOne.readLine();

	//	brOne.close();		

		System.out.println("Enter your SurName = ");
                String surName = brTwo.readLine();

		brTwo.close();

	}
}
