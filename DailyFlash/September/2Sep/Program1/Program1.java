

import java.io.*;

class Program1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int range1 = Integer.parseInt(br.readLine());
		int range2 = Integer.parseInt(br.readLine());

		System.out.println("Series of Even Number Ranging between " + range1 + " & " + range2 + " is ");
		for(int i = range1; i <= range2; i++) {

			if(i % 2 == 0) {

				System.out.print(i + " ");
			}
		}
	}
}
