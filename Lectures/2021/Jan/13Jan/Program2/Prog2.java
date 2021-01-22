

class ExceptionDemo1 {

        public static void main(String[] args) {

                System.out.println("In Main");
        
		ExceptionDemo obj = null; 	// new ExceptionDemo();
		obj.fun();

                System.out.println("In Main - after fun");
        }

        void fun() {

                System.out.println("In fun");
                gun();
                System.out.println("In fun - after gun");
        }

        static void gun() {

                System.out.println("In Main");
        }
}
