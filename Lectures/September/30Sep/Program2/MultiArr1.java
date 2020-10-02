

import java.util.*;

class MultiArr1 {

        public static void main(String[] args) {

                int marr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
                System.out.println("Entered elements are = ");

                for(int i = 0; i < 3; i++) {

                        for(int j = 0; j < 3; j++) {

                                System.out.print(marr[i][j] + " ");
                        }

                        System.out.println();
                }
        }
}
