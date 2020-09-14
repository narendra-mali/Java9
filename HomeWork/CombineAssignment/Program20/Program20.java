

class Program20{

	public static void main(String[] args) {
	
		int n = 65;
		int m = 97;

		for(int i = 0; i < 4; i++) {
		
			for(int j = 0; j < 4; j++) {
			
				if(i % 2 == 0) {
					System.out.print((char)n + "  ");
					n++;
				}		
	
				else {

					System.out.print((char)m + "  ");
					m++;
				}
			}
			System.out.println();
		}	
	}
}
