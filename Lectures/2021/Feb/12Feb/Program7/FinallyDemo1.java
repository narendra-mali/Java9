

class FinallyDemo {

        public static void main(String[] args) {

                try {

                        System.out.println("In Try");
			System.out.println(10/0);
                }
                catch(Exception e) {

                        System.out.println("In catch");
                }
                finally {

                        System.out.println("In finally");
                }
        }
}

/*
 * In Try
 * In catch
 * In finally
 */
