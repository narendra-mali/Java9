

import java.io.*;

class Core2Web {

        public static void main(String arg[]) {

		try {

			InputStreamReader isr = new  InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			int totalKeyboardKeys = Integer.parseInt(br.readLine());
            		System.out.println(totalKeyboardKeys);
		}
		catch(IOException obj) {
		
			System.out.println("IOException occurred");
		}
        }
}
