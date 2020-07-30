

class SwitchDemo {

        public static void main(String[] args) {

                char x = 128;
	//	char x = 32768;		// No Error
	//	char x = 40000; 	// No Error

                switch(x) {

                        case 'A' :
                                System.out.println("First Case");       
                                break;

                        case 'B' :
                                System.out.println("Second Case");
                                break;
                }	

		char y = 'A';				// A-Z -> 65-90 a-z -> 97-122
		
		switch(y) {

                        case 65 :
                                System.out.println("A");       
                                break;

                        case 'B' :
                                System.out.println("B");
                                break;
                }

	/*	char z = 'A';                        

                switch(z) {

                        case 65 :
                                System.out.println("A -ascii");
                                break;

			case 'A' :					// error: duplicate case label
                                System.out.println("A -char");	
                                break;
                }	*/

	}
}

