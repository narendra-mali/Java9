

import java.io.*;

class CheckedDemo1 {

        public static void main(String[] args) {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                try {

                        System.out.println(br.readLine());
                }
                catch(IOException e) {

                        System.out.println("IOException catched");
                }

		System.out.println("End of program");
        }
}

/*
 * Core2Web
 * End of program
 */
