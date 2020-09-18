

import java.io.*;

class Program2 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Range: ");
                int range1 = Integer.parseInt(br.readLine());
                int range2 = Integer.parseInt(br.readLine());

                for(int i = range1; i <= range2; i++) {

                        if(i % 2 == 0) {

                                System.out.print((i * i) + " ");
                        }
                        else
                                System.out.print((i * i * i) + " ");
                }
        }
}

