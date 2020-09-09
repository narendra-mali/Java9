


import java.io.*;

class Pattern23 {

	public static void main(String args[]) {

		for(int i = 0; i < 4 ; i++) {

			for(int j = 0; j < 4-i; j++) {
			
				if(j % 2 == 0) {
				
					System.out.print("+ " + " ");
			  
				}
				else {
			
					System.out.print("= " + " ");
				}
		}
		
		System.out.println();
		}
	}
}
