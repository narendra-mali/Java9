

import java.io.*;

class Predecessor {

        public static void main(String arg[]) throws IOException{

                  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                  int n = Integer.parseInt(br.readLine());

		  int n1 = n + 2;
		  int n2 = n - 2;

                  System.out.println("Second Predecessor = " + n2);
           	  System.out.println("Second Successor = " + n1);

          }
}

