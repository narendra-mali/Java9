

import java.util.*;

class Jagged2DArr1 {

	public static void main(String[] args) {

		int[][] xarr = new int[2][];

                xarr[0] = new int[3];
                xarr[1] = new int[2];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements : ");

		for(int i=0; i < xarr.length ; i++) {
			for(int j=0; j < xarr[i].length ; j++) {

				xarr[i][j]=sc.nextInt();
			}
		}

		System.out.println("2D Jagged Array : ");
		for(int i=0; i < xarr.length ; i++) {

			for(int j=0; j < xarr[i].length ; j++) {

				System.out.print(xarr[i][j]+" ");
			}

			System.out.println();
		}
	}
}
