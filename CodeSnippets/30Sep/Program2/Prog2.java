

import java.io.*;

class Core2Web {

        public static void main(String[] args) throws IOException {

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                String country1 = br.readLine();
                br.skip(5);

                String country2 = br.readLine();

                System.out.println(country1 + " " + country2);

        }
}
