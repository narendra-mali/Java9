

class DivaPattern {

	public static void main(String[] args) {
        
	int rows = 3, r = 2,i,j;

	for(i=1; i <= r; i++) {
		
		for(j = r; j > i; j--) {
       
			System.out.print(" ");
    		}
		
		System.out.print(" ^");  
		
		for(j = 1; j < (i-1) * 2; j++) {
       
			System.out.print(" ");
    		}
    
		if(i == 1) {
      
			System.out.print("\n");
    		}
    
		else {
      
			System.out.print(" ^\n");
    		}
	}


	for(i = r - 1; i >= 1; i--) {
    
		for(j = rows; j > i; j--) {
       
			System.out.print(" ");
    		}
    		
		System.out.print(" ^");
    
		for(j = 1; j < (i-1) * 2; j++) {
       
			System.out.print(" ");
    		}
    
		if(i == 1) {
      
			System.out.print("\n");
    		}
    
		else {
      
			System.out.print("^\n");
    		}
    	}

        for(i = rows; i >= 1; --i) {
            
		for(int space = 1; space <= rows - i; ++space) {
                	
			System.out.print("  ");
            	}

            for(j = i; j <= 1 * i ; ++j) {
                
		    System.out.print("~ ");
            }

            for(j = 0; j < i - 1; ++j) {
                
		    System.out.print(" ~ ");
            }

            System.out.println();
        }
    }
}
