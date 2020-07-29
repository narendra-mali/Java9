

class SwitchDemo {

	public static void main(String[] args) {
	
	//	int var = 10;
	        int var = 4;

		System.out.println("Before Switch");

		switch(var) {
		
			 case 1:
				System.out.println("One");	//false
			 case 2:
                                System.out.println("Two");	//false
			 case 3:
                                System.out.println("Three");	//false
			 case 4:
                                System.out.println("Four");	//True
			 case 5:
                                System.out.println("Five");	//if we dont give break ->print all statement till it gets break
			 case 6:
                                System.out.println("Six");
			 case 7:
                                System.out.println("Seven");
			 case 8:
                                System.out.println("Eight");
			 case 9:
                                System.out.println("Nine");
			 case 10:
                                System.out.println("Ten");

		}

		System.out.println("After Switch");
	}
}
