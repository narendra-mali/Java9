

import java.util.*;

class Jagged2DArr2 {

        public static void main(String[] args) {
		
		// 1st Way
		System.out.println("2D Jagged Array 1st Way : ");
                int[][] xarr = new int[2][];
		
		xarr[0] = new int[2];
		xarr[1] = new int[1];

                Scanner sc = new Scanner(System.in);
                
		System.out.println("Enter elements : ");
                for(int i = 0; i < xarr.length; i++) {
                        for(int j = 0; j < xarr[i].length; j++) {

                                xarr[i][j] = sc.nextInt();
                        }
                }

                System.out.println("2D Jagged Array : ");
                for(int i = 0; i < xarr.length ; i++) {

                        for(int j = 0; j < xarr[i].length ; j++) {

                                System.out.print(xarr[i][j]+" ");
                        }

                        System.out.println();
                }

		System.out.println();
		
		// 2nd Way
		System.out.println("2D Jagged Array 2nd Way : ");
		int[][] xarr1 = {{10,20},{30,40,50,60}};

		System.out.println("Array 1 : ");
                for(int i = 0; i < xarr1.length; i++) {

                        for(int j = 0; j < xarr1[i].length; j++) {

                                System.out.print(xarr1[i][j] + " ");
                        }

                        System.out.println();
                }

		System.out.println();

		// 3rd Way
		System.out.println("2D Jagged Array 3rd Way : ");
		int[][] xarr2 = new int[2][];

		xarr2[0] = new int[]{100,200,300,400};
		xarr2[1] = new int[]{500};
		
		for(int i = 0; i < xarr2.length; i++) {

                        for(int j = 0; j < xarr2[i].length; j++) {

                                System.out.print(xarr2[i][j] + " ");
                        }

                        System.out.println();
                }
		
        }
}
