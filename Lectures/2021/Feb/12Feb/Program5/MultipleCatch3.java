

class MultipleCatch {

        public static void main(String[] args) {

                try {

                        System.out.println(10/0);
                }
                catch(ArithmeticException ae) {

                        System.out.println("Arithmetic Exception");
                }
                catch(Exception obj) {

                        System.out.println("Again Arithmetic Exception");
                }
        }
}

/*
 * Arithmetic Exception
 */
