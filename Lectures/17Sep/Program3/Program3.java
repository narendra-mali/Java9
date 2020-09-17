

import java.io.*;

class IOExceptionDemo2 {

        public static void main(String[] args) throws IOException{

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter Numbers = ");

                String input1 = br.readLine();
                System.out.println(input1);

                String input2 = br.readLine();
                System.out.println(input2);

		System.out.println(input1 + input2);		//1020

        }
}
