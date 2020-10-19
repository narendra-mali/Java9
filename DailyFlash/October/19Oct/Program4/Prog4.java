

import java.io.*;

class IndexArray {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int Index = 1;
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

		System.out.println("\n\nFind the index of : ");
                int x = Integer.parseInt(br.readLine());

		for(int i = 0 ; i < arr1.length; i++) {
		
			if(x == arr1[i]) {
			
				Index = i;
			}
		}
		System.out.println("Position : " + Index);
	}
}
