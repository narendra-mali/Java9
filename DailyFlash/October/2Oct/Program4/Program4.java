

import java.io.*;

class Program4 {

	static void hourGlass(int mat[][],int N) {
	
		for(int i = 0; i < N - 2; i++) {
		
			for(int j = 0; j < N - 2; j++) {
			
				System.out.println("" + mat[i][j] + " " + mat[i][j + 1] + " " + mat[i][j + 2] + "\n  " + mat[i + 1][j + 1] + "\n" + mat[i + 2][j] + " " + mat[i + 2][j + 1] + " " + mat[i + 2][j + 2] + "\n");

			}
		}
	}

	static public void main(String[] args) throws IOException {
	
		int i,j,N;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		int A[][] = new int[N][N];
		int B[][] = new int[N][N];

		for(i = 0; i < N; i++) {
		
			for(j = 0; j < N; j++) 

				A[i][j] = Integer.parseInt(br.readLine());
		}
		
		hourGlass(mat[][], N);
	}
}
