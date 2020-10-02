

import java.io.*;

class Input3DArray {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number of planes : ");
		int plane = Integer.parseInt(br.readLine());

		System.out.println("Enter number of rows : ");
		int row = Integer.parseInt(br.readLine());

		System.out.println("Enter number of cols : ");
                int col = Integer.parseInt(br.readLine());

		int marr[][][] = new int[plane][row][col];
               
                for(int i = 0; i < plane; i++) {

                        for(int j = 0; j < row; j++) {

				for(int k = 0; k < col; k++) {

					int a = Integer.parseInt(br.readLine());
                                	marr[i][j][k] = a;
				}
                        }
                }

                System.out.println("1st palne are = ");

                for(int i = 0; i < plane; i++) {

			if(i == 1)
				System.out.println("2nd plane are = ");

                        for(int j = 0; j < row; j++) {

				for(int k = 0; k < col; k++) {

					System.out.print(marr[i][j][k] + " ");
				}

                        	System.out.println();
			}
                }
        }
}
