

import java.util.*;

class Jagged2DArr4 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

		int xarr[][] = new int[3][];

		xarr[0] = new int[3];
		xarr[1] = new int[2];
		xarr[2] = new int[5];

		System.out.println("Enter elements : ");
                for(int i = 0; i < xarr.length; i++) {
                  
		  	for(int j = 0; j < xarr[i].length; j++) {

                                xarr[i][j] = sc.nextInt();
                        }
                }

		System.out.println("Even numbers : ");
                for(int i = 0; i < xarr.length ; i++) {

                        for(int j = 0; j < xarr[i].length ; j++) {

				if(xarr[i][j] % 2 == 0) 
				
					System.out.print(xarr[i][j] + " ");
                        }
               }
	}
}
