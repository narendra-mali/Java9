


import java.io.*;

class QueReminder {

        public static void main(String arg[]) throws IOException{

                  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                  int num1 = Integer.parseInt(br.readLine());
                  int num2 = Integer.parseInt(br.readLine());

                  int q = num1 / num2;
		  int r = num1 % num2;

                  System.out.println("Quotient: " + q);
		  System.out.println("Reminder: " + r);

          }
}

