


import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.skip(5);
		String str = br.readLine();

                System.out.println(str);
        }
}

/*
 * Input - 
 * Hello
 *
 * Output- 
 * No output
 */
