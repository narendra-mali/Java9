

class TryRuntimeDemo1 {

	int x = 10;

        public static void main(String[] args) {

                try {

                        TryRuntimeDemo1 obj = null;
			System.out.println(obj.x);
                }
                catch(NullPointerException e) {

                        System.out.println("Exception Handled");
                }

                System.out.println("After try catch");
        }
}

/*
 * Exception Handled
 * After try catch
 */
