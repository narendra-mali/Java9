

import java.util.*;

class JaggedArray5 {

        public static void main(String[] args) {

                int[][] stud = new int[3][];

                Scanner sc = new Scanner (System.in);
                stud[0] = new int[]{50,60,70,90};
                stud[1] = new int[]{20,40,80};
                stud[2] = new int[]{55,77,66,91};

                for(int i = 0; i < stud.length; i++) {

                        for(int j = 0; j < stud[i].length; j++) {

                                System.out.print(stud[i][j] + " ");
                        }
                        System.out.println();
                }

                for(int i = 0; i < stud.length; i++) {

                        int sum = 0;
			int k = stud[i].length;

                        for(int j = 0; j < k; j++) {

                                sum = sum + stud[i][j];
                        }
                        System.out.println("Average of Student " + (i + 1) + " is : " + (sum/k));
                }
        }
}
