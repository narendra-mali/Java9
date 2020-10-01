

import java.io.*;

class GreatestArray {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Number = ");
                int num = Integer.parseInt(br.readLine());
               
                int[] arr = new int[num];
		int max = arr[0];

                for(int i = 0; i < num; i++) {

                        System.out.print("Enter element = " );
                        arr[i] = Integer.parseInt(br.readLine());
			
			if(arr[i] > max)
			
				max = arr[i];
                }

                System.out.println("Greatest Number = " + max);
        }
}
