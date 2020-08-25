

import java.io.*;

class Program4 {

        public static void main(String[] args) throws IOException {

		float sum = 0;
		float avg;
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i <= num; i++ ) {
		
			sum = sum + i;
		}

		avg = sum / num;
		System.out.println("Sum of " + num + " entered number is : " + sum);
		System.out.println("Average of " + num + " entered number is : " + avg);
	}
}
