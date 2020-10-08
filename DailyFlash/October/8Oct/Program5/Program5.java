

import java.util.*;

class Jagged2DArr5 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
		int sum = 0;
                int xarr[][] = new int[3][];

                xarr[0] = new int[3];
                xarr[1] = new int[2];
                xarr[2] = new int[5];

                System.out.println("Enter elements : ");
                for(int i = 0; i < xarr.length; i++) {

                        for(int j = 0; j < xarr[i].length; j++) {

                                xarr[i][j] = sc.nextInt();
                        }
                }

                for(int i = 0; i < xarr.length ; i++) {

                        for(int j = 0; j < xarr[i].length ; j++) {

                                if(xarr[i][j] % 5 == 0)

                                        sum = sum + xarr[i][j];
                        }
               }
	       System.out.println("Sum of numbers divisible by 5 : " + sum);
        }
}
