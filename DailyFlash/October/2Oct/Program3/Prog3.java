

import java.util.*;

class Prog3 {

	public static void main(String[] args) {

                int marr[][] = new int[3][3];
                
                Scanner sc = new Scanner(System.in);

                for(int i = 0; i < 3; i++) {

                        for(int j = 0; j < 3; j++) {

                                marr[i][j] = sc.nextInt();
                        }
                }

                System.out.println("Entered matrix is = ");

                for(int i = 0; i < 3; i++) {

                        for(int j = 0; j < 3; j++) {

                                System.out.print(marr[i][j] + " ");
                        }

                        System.out.println();
                }

                System.out.println();
		for(int i = 0; i < 3; i++) {

			int sumRow = 0;
                        for(int j = 0; j < 3; j++) {

				sumRow = sumRow + marr[i][j];
			}
		
			System.out.println("Addition of row " + (i+1) + " : " + sumRow);
		}

		System.out.println();
                for(int i = 0; i < 3; i++) {

                        int sumCol = 0;
                        for(int j = 0; j < 3; j++) {

                                sumCol = sumCol + marr[j][i];
                        }

                        System.out.println("Addition of column " + (i+1) + " : " + sumCol);
                }
	}
}
