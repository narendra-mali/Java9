

import java.io.*;

class Program4 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int row = Integer.parseInt(br.readLine());
		int col = Integer.parseInt(br.readLine());

		int num = 1;
		for(int i = row; i <= col; i++) {
		
			for(int j = 1; j <= i; j++) {
			
				System.out.print(num + " ");
				num++;
			}

			System.out.println();
		}
	}
}
