

class Core2Web {

        void method1(double var1) {

                System.out.println("In Method1");
        }

        void method1(int... var2) {

                System.out.println("In Method2");
        }

        public static void main(String[] args) {

                Core2Web c2w = new Core2Web();
                c2w.method1(10);
        }
}

/*
 * In Method1
 */
