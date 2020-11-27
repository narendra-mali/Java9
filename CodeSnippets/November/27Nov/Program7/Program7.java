

class Core2Web {

        Core2Web() {

                System.out.println("In constructor");
		return 10;
        }

        public static void main(String[] args) {

                Core2Web c2w = new Core2Web();
		System.out.println(c2w);
        }
}

/*
 * Output
 *
 * Compile time error
 *
 */
