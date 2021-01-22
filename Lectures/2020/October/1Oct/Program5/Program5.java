



import java.io.*;

class Input3DArray {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int plane = 2, rows = 3, cols = 3;
		int marr[][][] = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}}};

                System.out.println("1st palne are = ");

                for(int i = 0; i < plane; i++) {

			if(i == 1)
				System.out.println("2nd plane are = ");

                        for(int j = 0; j < rows; j++) {

				for(int k = 0; k < cols; k++) {

					System.out.print(marr[i][j][k] + " ");
				}

                        	System.out.println();
			}
                }
        }
}
