

import java.util.*;

class Prog2 {

        public static void main(String[] args) {

                int marr[][] = new int[3][3];
		int sum = 0;
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
                System.out.println("Even numbers are : ");

		for(int i = 0; i < 3; i++) {

                        for(int j = 0; j < 3; j++) {

				if(marr[i][j] % 2 == 0) 
                                
					System.out.print(marr[i][j] + " ");

				if(marr[i][j] % 2 == 0)
				
					sum = sum + marr[i][j];
			}
		}
		System.out.println();
		System.out.println("Addition of even numbers are = " + sum);
	}
}
