


import java.io.*;

class Core2Web {

        public static void main(String arg[]) {

                try {

                        InputStreamReader isr = new  InputStreamReader(System.in);
                        BufferedReader br = new BufferedReader(isr);
                }
                catch(IOException obj) {

                        System.out.println("IOException occurred");
                }

		char tier = br.read();			//Error
		System.out.println(tier);
        }
}
