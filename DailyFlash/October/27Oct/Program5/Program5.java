

import java.util.Scanner;

class PascalTriangle {

	public static void main(String[] args) {

		int r,c = 1,sp,i,j;

    		System.out.print("Enter number of rows: ");
    
		Scanner in = new Scanner(System.in);
		r = in.nextInt();
    
		for(i = 0; i < r; i++) {
        
			for(sp = 1; sp <= r - i; sp++)
        
				System.out.print(" ");
        
			for(j = 0; j <= i; j++) {
            
				if (j == 0 || i == 0)
                			c = 1;
            
				else
               				c = c * (i-j+1) / j;
            
				System.out.print(" " + c);
        		}
        
			System.out.print("\n");
    		}
	}
}
