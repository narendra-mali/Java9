

import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                
		Integer f = Integer.parseInt(br.readLine());

                System.out.println(s + " " + f);
        }
}

/*
 * Output -
 *  
 * String and int value will be printed
 */
