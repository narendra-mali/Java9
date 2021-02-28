

class ThrowDemo1 {

	static ArithmeticException ae = new ArithmeticException();

        public static void main(String[] args) {

                throw ae;
        }
}

/*
 * Exception in thread "main" java.lang.ArithmeticException
	at ThrowDemo1.<clinit>(ThrowDemo1.java:5)
 */
