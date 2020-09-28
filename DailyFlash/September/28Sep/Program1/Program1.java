

import java.io.*;

class Program1 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Name :");
		String name = br.readLine();

		System.out.print("Roll No :");
		int rollNo = Integer.parseInt(br.readLine());

		System.out.print("Field Of Interest :");
		String field = br.readLine();

		System.out.println("Hey, my name is " + name + " and my roll number is " + rollNo + ". My field of Interest are " + field + ".");
	}
}
