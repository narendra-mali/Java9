

import java.io.*;

class SeriesNo {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number = ");
		int num = Integer.parseInt(br.readLine());

		int temp = 1;
		
		for(int i = 0; i < num; i++) {

			System.out.print(temp + " ");
			temp = temp + num;
		}

	}	

}	
