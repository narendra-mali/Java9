

import java.io.*;

class Program4 {

        public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

                for(int i = 1; i <= 10; i++) {
		
			System.out.print(i * n + " ");
		} 

        }

}

