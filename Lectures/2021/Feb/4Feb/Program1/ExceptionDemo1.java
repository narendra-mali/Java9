

class ExceptionDemo {

	public static void main(String[] args) {
	
		System.out.println("Before Exception");
		try{

			System.out.println(10/0);
		}catch(ArithmeticException e) {
		
			System.out.println("Handling Code");
		}
		System.out.println("After Exception");
	}
}

/*
 * Before Exception
 * Handling Code
 * After Exception
 */
