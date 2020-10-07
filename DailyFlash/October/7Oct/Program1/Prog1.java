

import java.util.*;

class JaggedArray1 {

	public static void main(String[] args) {

		int[][] xarr=new int[3][];
	
		Scanner sc=new Scanner (System.in);

		System.out.print("Enter number of columns for row 1 : ");
		int a = sc.nextInt();
		xarr[0]=new int[a];

		System.out.print("Enter number of columns for row 2 : ");
		int b = sc.nextInt();
		xarr[1]=new int[b];

		System.out.print("Enter number of columns for row 3 : ");
		int c = sc.nextInt();
		xarr[2]=new int[c];
		
		System.out.println("Enter elements : ");
		for(int i=0; i < xarr.length ; i++) {
			for(int j=0; j < xarr[i].length ; j++) {

				xarr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i < xarr.length ; i++) {
		
			for(int j=0; j < xarr[i].length ; j++) {

				System.out.print(xarr[i][j]+" ");
			}
		
			System.out.println();
		}
	}
}
