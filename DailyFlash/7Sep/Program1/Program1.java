

import java.io.*;

class SwapNumber {

        public static void main(String arg[]) throws IOException{

                  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                  int a = Integer.parseInt(br.readLine());
		  int b = Integer.parseInt(br.readLine());

		  int temp;

		  System.out.println("Before Swap: a = " + a + " & b = " + b);

		  temp = a;
		  a = b;
		  b = temp;

                  System.out.println("After Swap: a = " + a + " & b = " + b);

          }
}

