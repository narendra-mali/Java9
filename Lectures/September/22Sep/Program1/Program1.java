


import java.io.*;

class PlayerInfo {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter player Info : ");

		int jerNo = Integer.parseInt(br.readLine());
		char grade = (char)br.read();
		br.skip(1);
		String name = br.readLine();
		double avg = Double.parseDouble(br.readLine());

		System.out.println("JerNo = " + jerNo);
		System.out.println("Grade = " + grade);
		System.out.println("Name = " + name);
		System.out.println("Average = " + avg);
	}
}
