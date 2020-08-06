

class Table {

	public static void main(String[] args) {
	
		int n = 3;

		System.out.println("Table of 3 is - ");

		for(int i = 1; i <= 10; i++) {
		
			System.out.print(n * i + ",");
		
		}
	
		System.out.println("\nEven number present in table - ");

		for(int i = 1; i <= 10; i++) {

			if((n * i) % 2 == 0) { 
                        	
				System.out.print(n * i + ",");
			}
                }

	}
}
