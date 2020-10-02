

import java.util.Arrays;
import java.util.Scanner;

class Array {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of Array = ");
		
		int size = sc.nextInt();
		int val = 0;

		if(size % 2 == 0) {
		
			System.out.println("Size of array should be odd");
			System.exit(0);
		}	
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];

		Arrays.fill(arr2,val);
		System.out.println("Enter " + size + " elements in array1 = ");

		for(int i = 0; i < arr1.length; i++) {
		
			arr1[i] = sc.nextInt();

			if(arr1[i] % 2 == 0) 
				arr2[i] = -1;
		}

		System.out.println("\nArray1 = " );
		for(int i = 0; i < arr1.length; i++) {

			System.out.println(arr1[i]);
		}

		System.out.println("\nArray2 = " );
                for(int i = 0; i < arr2.length; i++) {

                        System.out.println(arr2[i]);
                }
	}
}
