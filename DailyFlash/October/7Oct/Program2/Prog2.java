

import java.util.*;

class JaggedSquare {

	public static void main(String[] args) {
		
		int sq = 0;
		int[][] xarr = new int[3][];
		
		xarr[0] = new int[4];
		xarr[1] = new int[2];
		xarr[2] = new int[4];

		Scanner sc = new Scanner (System.in);
		
		for(int i = 0; i < xarr.length ; i++) {
		
			for(int j = 0; j < xarr[i].length ; j++) {

				xarr[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < xarr.length; i++) {
			
			for(int j = 0; j < xarr[i].length; j++) {
			
				sq = xarr[i][j] * xarr[i][j];
				System.out.print(sq + " ");
			}
			
			System.out.println();
		}
	}
}
