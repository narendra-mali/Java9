


import java.io.*;

class Pattern22{

	public static void main(String args[])throws IOException{

		int num = 7;

		for(int i = 0; i < 4; i++){

			num = 7 - i;

			for(int j = 0; j <= i; j++){

				System.out.print(num-- + " ");
			}
			System.out.println();

		}


	}

}
