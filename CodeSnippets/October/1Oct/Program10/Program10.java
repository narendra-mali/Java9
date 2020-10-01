

import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
                char ch = (char)br.read();
		String str2 = br.readLine();

                System.out.println(str1);
		System.out.println(ch);
		System.out.println(str2);
        }
}

/*
 * Input - 
 * Hello
 * A
 * Bye
 *
 * Output - 
 * Hello
 * A
 * New Line
 */
