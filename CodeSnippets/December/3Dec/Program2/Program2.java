

class BiEncaps {

        BiEncaps(int a) {

                System.out.println("You are in BiEncaps constructor");
        }
}

class Core2Web extends BiEncaps {

        Core2Web() {

		super();
                System.out.println("You are in Core2Web Constructor");
        }
}

class Demo {

        public static void main(String[] args) {

                BiEncaps be = new BiEncaps();
                Core2Web c2w = new Core2Web();
        }
}

/*
 * Compile time error
 */
