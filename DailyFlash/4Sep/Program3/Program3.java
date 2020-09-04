


import java.io.*;

class Area {

        public static void main(String arg[]) throws IOException{

                  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                  int l = Integer.parseInt(br.readLine());
		  int b = Integer.parseInt(br.readLine());

                  int area = l * b;
                  System.out.println("Area of Rectangle = " + area);

          }
}

