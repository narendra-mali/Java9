

import java.io.*;

class Program5 {

    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Rows = ");
	int row = Integer.parseInt(br.readLine());
        int num = 1;

        for (int i = row; i > 0; i--) {
 
     		for (int j = 1; j <= i; j++) {
                
			System.out.print(" ");
            	}

            for (int j = 1; j <= num; j++) {
               
		    System.out.print(num + " ");
            }

            System.out.println();
	    num++;
        }
    }
}
