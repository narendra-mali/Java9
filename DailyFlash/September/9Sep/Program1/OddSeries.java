

import java.io.*;

class OddSeries {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for(int i = num; i >= 0; i--) {
		
			if(i % 2 != 0) {
			
				System.out.print(i + " ");
			}
		}
	}
}
