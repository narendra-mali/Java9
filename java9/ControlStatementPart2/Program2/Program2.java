

class SwitchDemo {

	public static void main(String[] args) {
	
	/*	byte x = 128;		// Error char -128 to 127 
		
		switch(x) {
		
			case 128 :
				System.out.println("First Case");	// Error
				break;

			case 110 :
				System.out.println("Second Case");
                                break;
		} */

		byte x = 127;           

                switch(x) {				// byte,short,int,char,String

                        case 127 :
                                System.out.println("First Case");       // First Case
                                break;

                        case 110 :
                                System.out.println("Second Case");
                                break;
                }


	}
}
