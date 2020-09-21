


class Pattern1 {

	public static void main(String[] args) {
		
		char ch = 'A';
		
		for(int row = 4; row >= 1; row--) {
			
			int num = 64;
			for(int space = 4; space >= row; space--) {
				
				System.out.print(" ");
			}
			
			for(int col = 1; col <= row; col++) {

				System.out.print((char) (num + col));
			}

		System.out.println();
		}
	}
}
