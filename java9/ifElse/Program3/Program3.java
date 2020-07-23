

class IfDemo3 {

	public static void main(String[] args) {
	
		boolean x = true;
		boolean y = false;
		boolean z = true;

		if(x && y) {		// true && false = false
		
			System.out.println("Hii");
		}

		System.out.println("Hello");

		if(x && z) {            // true && true = true

                        System.out.println("Hii");
                }

                System.out.println("Hello");

	}
}
