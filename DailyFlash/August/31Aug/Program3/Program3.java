

import java.io.*;

class Program3 {

        public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int range = Integer.parseInt(br.readLine());

                for(int i = 1; i <= range; i++) {

                        if(i % 2 != 0 ) {

                                System.out.println("Cube of " + i + " : " + i * i * i + " and Square of " + i + " : " + i * i);
                        }
                }
        }
}
