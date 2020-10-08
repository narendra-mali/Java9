

import java.util.*;

class JaggedCube {

	public static void main(String[] args) {
	
		int num = 10;
		
		int[][] xarr = new int[3][];
		xarr[0] = new int[2];
		xarr[1] = new int[6];
		xarr[2] = new int[2];

		Scanner sc = new Scanner (System.in);
		
		for(int i = 0; i < xarr.length; i++) {
		
			for(int j = 0; j < xarr[i].length; j++) {
				
				xarr[i][j] = num * num * num;
				num--;
			}
		}

		for(int i = xarr.length-1 ; i >= 0; i--) {

			for(int j = xarr[i].length-1; j >= 0; j--) {
			
				System.out.print(xarr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
