

class NestedDemo {

	public static void main(String[] args) {
	
		try {
		
			System.out.println("In Outer Try");

			try {
			
				System.out.println("Inside Inner Try");
				System.out.println(10/0);
			}catch(ArithmeticException ae) {
			
				System.out.println("Inside Inner class(try)");
			}
		}catch(NullPointerException npe) {
		
			System.out.println("In Outer catch");

			try {

                                System.out.println("Inside Outer Try");
                        }catch(ArithmeticException ae) {

                                System.out.println("Inside Inner class(catch)");
                        }
		}
		finally {
		
			System.out.println("In Finally");

                        try {

                                System.out.println("Inside Try(Finally)");
                        }catch(ArithmeticException ae) {

                                System.out.println("Inside catch(finally)");
                        }
		}
	}
}

/*
 * Output:-
 * In Outer Try
 * Inside Inner Try
 * Inside Inner class(try)
 * In Finally
 * Inside Try(Finally)
 */
