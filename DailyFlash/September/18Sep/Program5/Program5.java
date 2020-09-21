


import java.io.*;

class Program5 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int range1 = Integer.parseInt(br.readLine());
                int range2 = Integer.parseInt(br.readLine());

                int fact = 1;
                for(int i = range1; i <= range2; i++) {

			fact = fact * i;
			System.out.println("Factorial of i = " + fact);
                              
                }
        }
}
