

import java.io.*;

class String2 {

        public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                String str1 = br.readLine();
		String str2 = br.readLine();

		String str3 = new String(str2);

                System.out.println(str1 + " " + str3);
        }
}
