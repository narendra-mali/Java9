

import java.util.*;

class JaggedCube {

	public static void main(String[] args) {
	
		int cube;

		int[][] xarr = new int[3][];
		xarr[0] = new int[2];
		xarr[1] = new int[6];
		xarr[2] = new int[2];

		Scanner sc = new Scanner (System.in);
		
		for(int i = 0; i < xarr.length; i++) {
		
			for(int j = 0; j < xarr[i].length; j++) {
				
				xarr[i][j] = sc.nextInt();
			}
		}

		for(int i = xarr.length-1 ; i >= 0; i--) {

			for(int j = xarr[i].length-1; j >= 0; j--) {
			
				cube = xarr[i][j] * xarr[i][j] * xarr[i][j];
				System.out.print(cube + " ");
			}
			System.out.println();
		}
	}
}
