

import java.util.*;

class ArrayDemo {

        public static void main(String[] args) {

                int marr[][] = {{12,23,34},{5,},{7,9}};
                System.out.println("Entered elements are = ");

                for(int i = 0; i < 3; i++) {

                        for(int j = 0; j < 3; j++) {

                                System.out.print(marr[i][j] + " ");
                        }

                        System.out.println();
                }
        }
}
