

import java.io.*;

class Core2Web {

        public static void main(String[] args) throws IOException {

                InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

                char var1 = (char)br.read();
                isr.close();
                String var2 = br.readLine();

                System.out.println(var1 + var2);
        }
}
