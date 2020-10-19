

import java.io.*;

class SumArray {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
                System.out.println("Enter size of Array : ");
                int size = Integer.parseInt(br.readLine());

                int arr1[] = new int[size];

                System.out.println("Enter elements : ");

                for(int i = 0; i < size; i++) {

                        arr1[i] = Integer.parseInt(br.readLine());
                }

                System.out.println("Sum : ");
                for(int i = 0; i < size; i++) {

			sum = sum + arr1[i];
                 }

		System.out.println(sum);
	}
}
