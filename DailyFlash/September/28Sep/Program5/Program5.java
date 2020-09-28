

import java.util.*;

class Program5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("No of Rows : ");
		int row = sc.nextInt();

		for(int i = 1; i <= row; i++) {
  
			for(int j = 1; j <= row; j++) {
  
				if((i+j) % 2 == 1) {
      	
					System.out.print("1 ");
  				}
  				else {
      				
					System.out.print("0 ");
  				}
  
			}

			System.out.println();
		}
	}
}
