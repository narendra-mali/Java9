

import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.skip(2);

                char ch = br.read();
                System.out.println(ch);
        }
}

/*
 * output
 *
 * Error : possible lossy conversion
 */
