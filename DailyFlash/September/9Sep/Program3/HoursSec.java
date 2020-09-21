

import java.io.*;

class HoursSec {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int hr = Integer.parseInt(br.readLine());

		int sec;

		sec = hr * 60 * 60;
		System.out.println(sec + " seconds");
                
        }
}
