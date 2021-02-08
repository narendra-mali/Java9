
/*
class Core2Web {

	int x = 20;
}

class ExceptionDemo {

	public static void main(String[] args) {
	
		try {
		
			System.out.println(10/0);
		}catch(Core2Web e) {				// Compile time error
		
			System.out.println("Handling code");
		}
	}
}
*/

/*
 class Core2Web extends Throwable {

        int x = 20;
}

class ExceptionDemo {

        public static void main(String[] args) {

                try {

                        System.out.println(10/0);
                }catch(Core2Web e) {                            // Compile time error

                        System.out.println("Handling code");
                }
        }
}

*/

class Core2Web extends RuntimeException {

        int x = 20;
}

class ExceptionDemo {

        public static void main(String[] args) {

                try {

                        System.out.println(10/0);
                }catch(Core2Web e) {                            // Runtime error

                        System.out.println("Handling code");
                }
        }
}

