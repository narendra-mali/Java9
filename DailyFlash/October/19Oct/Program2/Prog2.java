

import java.io.*;

class ReverseArray {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter size of Array : ");
                int size = Integer.parseInt(br.readLine());

                int arr1[] = new int[size];

                System.out.println("Enter elements : ");

                for(int i = 0; i < size; i++) {

                        arr1[i] = Integer.parseInt(br.readLine());
                }

                System.out.println("Elements are : ");
                for(int i = 0; i < size; i++) {

                        System.out.print(arr1[i] + " ");
                 }

		System.out.println("\nReverse Elements are : ");
		for (int i = arr1.length-1; i >= 0; i--) {  

                        System.out.print(arr1[i] + " ");
                }
	}
}
