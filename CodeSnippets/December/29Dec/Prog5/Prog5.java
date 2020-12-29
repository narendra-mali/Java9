

class Core2Web {

        void method1(String var1) {

                System.out.println("In Method1");
        }

        public static void main(String[] args) {

                Core2Web c2w = new Core2Web();
                c2w.method1(new Object());
        }
}

/*
 * Compile time error
 */
