

import java.io.*;

class IOExceptionDemo1 {

        public static void main(String[] args) throws IOException{

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Numbers = ");

                int input1 = Integer.parseInt(br.readLine());
                System.out.println(input1);

                int input2 = Integer.parseInt(br.readLine());
                System.out.println(input2);

        }
}
