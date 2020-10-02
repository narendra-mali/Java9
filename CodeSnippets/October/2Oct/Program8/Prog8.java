


import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                char c = (char)br.read();
           	br.skip(1);
	   	String s = br.readLine();

                System.out.println(s);
        }
}
