

abstract class Core2Web {
        {
                System.out.println("1");
        }
        static {

                System.out.println("2");
        }
}

class Test {

        public static void main(String[] args) {

                Core2Web obj = new Core2Web(){};
        }
}

/*
 * 2
 * 1
 */
