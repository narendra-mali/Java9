

class BiEncaps {

        BiEncaps(int a) {

                System.out.println("You are in BiEncaps constructor");
        }
}

class Core2Web extends BiEncaps {

}

class Demo {

        public static void main(String[] args) {

                Core2Web c = new Core2Web();
        }
}

/*
 * Compile time error
 */
