



import java.util.*;

class InputMultiArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rows and Cols : ");
		int row = sc.nextInt();
		int col = sc.nextInt();

		char marr[][] = new char[row][col];

		for(int i = 0; i < row; i++) {

			for(int j = 0; j < col; j++) {

				marr[i][j] = sc.next().charAt(0);
			}
		}

		System.out.println("Entered elements are = ");

		for(int i = 0; i < row; i++) {

                        for(int j = 0; j < col; j++) {

                                System.out.print(marr[i][j] + " ");
                        }

			System.out.println();
                }
	}
}
