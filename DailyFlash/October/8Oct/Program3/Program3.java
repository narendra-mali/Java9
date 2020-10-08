

import java.util.*;

class Jagged2DArr3 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		int sum = 0;

		int xarr[][] = new int[row][];
	       	
		xarr[0] = new int[2];
		xarr[1] = new int[4];
		xarr[2] = new int[2];

		System.out.println("Enter elements : ");
                for(int i = 0; i < xarr.length; i++) {
                        for(int j = 0; j < xarr[i].length; j++) {

                                xarr[i][j] = sc.nextInt();
                        }
                }

                for(int i = 0; i < xarr.length ; i++) {

                        for(int j = 0; j < xarr[i].length ; j++) {

				sum = sum + xarr[i][j];
				System.out.print(xarr[i][j] + " ");
                        }

			System.out.println();
                }
		System.out.println("Sum = " + sum);
	}
}
