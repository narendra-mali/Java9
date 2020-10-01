

import java.io.*;

class ArraySum {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Number = ");
                int num = Integer.parseInt(br.readLine());
		int sum = 0;

                int[] arr = new int[num];

                for(int i = 0; i < num; i++) {

			System.out.print("Enter element = " );
                        arr[i] = Integer.parseInt(br.readLine());
                }

		for(int i = 0; i < num; i++) {

			sum = sum + arr[i];
                }

		System.out.println("Sum = " + sum);
        }
}
