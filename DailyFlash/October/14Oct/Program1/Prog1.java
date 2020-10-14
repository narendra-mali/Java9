

import java.util.*;

class MultiArray1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rows and Cols : ");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int arr[][] = new int[row][col];

		System.out.println("Enter elements : ");
		for(int i = 0; i < row; i++) {

			for(int j = 0; j < col; j++) {

				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Entered elements are = ");

		for(int i = 0; i < row; i++) {

                        for(int j = 0; j < col; j++) {

                                System.out.print(arr[i][j] + " ");
                        }

			System.out.println();
                }

		System.out.println("Length of Multidimensional array is : " + row);
	}
}
