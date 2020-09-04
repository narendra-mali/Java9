


import java.io.*;

class ReverseTable {

        public static void main(String arg[]) throws IOException{

                  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                  int n = Integer.parseInt(br.readLine());

		for (int i = 10; i >= 1; i--) {

			System.out.println(n + " x " + i + " = " + (n * i));
		}
		 
	}
}
