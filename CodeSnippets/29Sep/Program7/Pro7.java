

import java.io.*;

class Core2Web {

        public static void main(String arg[]) throws IOException {

                InputStreamReader isr = new  InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                char division = (char)br.read();             
                System.out.println(division);
        }
}
