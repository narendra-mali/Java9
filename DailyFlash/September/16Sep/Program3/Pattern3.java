

class Pattern3 {

	public static void main(String[] args) {
	
		int k = 1;
		for(int i = 0; i < 4; i++) {
		
			for(int j = 0; j <= i; j++) {
			
				int l;
				l = (k * k) + 1;
				System.out.print(l + " ");
				k++;
			}

			System.out.println();
		}
	}
}
