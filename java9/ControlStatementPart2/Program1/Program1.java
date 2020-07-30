

class SwitchDemo {

	public static void main(String[] args) {
	
	/*	short x = 100;
		
		switch(x) {
		
			case 100 :
				System.out.println("First Case");	// First Case
				break;

			case 200 :
				System.out.println("Second Case");
                                break;
		}*/

		short x = 32767;
	//	short x = 32768;	// Error
	//	short x = -32769	// Error

                switch(x) {

                        case 32767 :
                                System.out.println("First Case");       // First Case
                                break;

                        case -110 :
                                System.out.println("Second Case");
                                break;
                }


	}
}
