

import java.io.*;

class FinallyDemo1 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine());

                try {

                        System.out.println("In Try");
		}
                catch(Exception e) {

                        System.out.println("In catch");
                }
                finally {

                        System.out.println("In finally");
			br.close();
                }
        }
}

/*
 * Core2Web
 * Core2Web
 * In Try
 * In finally
 */
