


class Program3 {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 4; i++ ) {
		
			for(int sp = 3; sp >= i; sp--) {
			
				System.out.print("  ");
			}

			char ch = 'A';
			for(int j = 1; j <= i; j++) {

				System.out.print(ch + " ");
				ch++;
			}

			System.out.println();
		}
	}
}
