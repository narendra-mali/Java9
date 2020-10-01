


import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

                br.skip(1);
                System.out.println(str);
        }
}

/*
 * Input - 
 * Hello
 * guys
 *
 * output - 
 * Hello
 */
