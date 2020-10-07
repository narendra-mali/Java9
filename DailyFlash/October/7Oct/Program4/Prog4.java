

import java.util.*;

class JaggedArray4 {

	public static void main(String[] args) {

		int[][] books = new int[4][];

	        Scanner sc = new Scanner (System.in);
		books[0] = new int[]{2,3,4,5};
		books[1] = new int[]{1,2};
		books[2] = new int[]{5,8,2,1,2};
		books[3] = new int[]{1,2,7};

		for(int i = 0; i < books.length; i++) {

			for(int j = 0; j < books[i].length; j++) {

				System.out.print(books[i][j] + " ");
			}
			System.out.println();
		}

		for(int i = 0; i < books.length; i++) {
			
			int sum = 0;
			for(int j = 0; j < books[i].length; j++) {

				sum = sum + books[i][j];
			}
			System.out.println("The number of books read by person " + (i + 1) + " is : " + sum);
		}
	}
}
