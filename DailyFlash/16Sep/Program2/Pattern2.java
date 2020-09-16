

class Pattern2 {

	public static void main(String[] args) {
			
		int num = 65;
		char ch = 'C';
			
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				if(j == 1)
					System.out.print((char) (num + 2) + " ");
				
				else if(j == 2)
					System.out.print((char) (num + 6) + " ");
				
				else if(j == 3)
					System.out.print((char) (num + 10) + " ");
				
				else if(j == 4)
					System.out.print((char) (num + 14) + " ");
				
				else if(j == 5)
					System.out.print((char) (num + 18) + " ");
			}

			System.out.println();
		}
	}
}
