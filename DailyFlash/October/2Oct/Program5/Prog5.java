

import java.util.*;

class Prog5 {

	public static void main(String[] args) {

                int marr[][] = new int[3][3];
		
		int tranposeArr[][] = new int[3][3];

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

		for(int i = 0; i < 3; i++) {

                        for(int j = 0; j < 3; j++) {

                                tranposeArr[i][j] = marr[j][i];
                        }
                }

		System.out.println();

		for(int i = 0; i < 3; i++) {

                        for(int j = 0; j < 3; j++) {

                                System.out.print(tranposeArr[i][j] + " ");
                        }

                        System.out.println();
                }
	}
}

