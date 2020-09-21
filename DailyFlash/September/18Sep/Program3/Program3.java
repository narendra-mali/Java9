

import java.io.*;

class Program3 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Range: ");
                int range1 = Integer.parseInt(br.readLine());
                int range2 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter number = ");
		int num = Integer.parseInt(br.readLine());
		int temp = 1;

                for(int i = range1; i <= range2; i++) {
	   
		   	System.out.print(temp + " ");	
			temp = temp + num;
                }
        }
}
