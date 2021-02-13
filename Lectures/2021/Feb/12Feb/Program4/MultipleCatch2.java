

class MultipleCatch {

        public static void main(String[] args) {

                try {

                        System.out.println(10/0);
                }
                catch(Exception e) {

                        System.out.println("Arithmetic Exception");
                }
                catch(ArithmeticException ae) {

                        System.out.println("Again Arithmetic Exception");
                }
        }
}

/*
 * MultipleCatch2.java:15: error: exception ArithmeticException has already been caught
                catch(ArithmeticException ae) {
                ^
 */
