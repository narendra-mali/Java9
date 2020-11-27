

class Core2Web {

        public Core2Web() {

                System.out.println("In public constructor");
        }

        private Core2Web() {

                System.out.println("In private constructor");
        }
}

class Demo {

        public static void main(String[] args) {

                Core2Web c2w = new Core2Web();
                c2w.Core2Web();
        }
}

/*
 * Output
 *
 *  error: constructor Core2Web() is already defined in class Core2Web
 *  canot find symbol
 */
