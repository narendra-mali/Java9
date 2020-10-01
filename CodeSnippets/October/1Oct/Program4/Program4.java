


import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in),5);
                String str = br.readLine();

		br.skip(1);
                System.out.println(str);
        }
}

/*
 * output
 * wait for next input
 */
