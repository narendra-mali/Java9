

//RuntimeException

class ThrowDemo {

	public static void main(String[] args) {
	
		throw new ArithmeticException("Divide by Zero");
	}
}

/*
 * Exception in thread "main" java.lang.ArithmeticException: Divide by Zero
	at ThrowDemo.main(ThrowDemo.java:7)
 */
