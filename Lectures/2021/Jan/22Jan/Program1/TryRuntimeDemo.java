

class TryRuntimeDemo {

	public static void main(String[] args) {
	
		try {
		
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
		
			System.out.println("Exception Handled");
		}

		System.out.println("After try catch");
	}
}

/*
 * Exception Handled
 * After try catch
 */
