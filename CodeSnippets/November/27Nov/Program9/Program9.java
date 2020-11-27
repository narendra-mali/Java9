


class Core2Web {

        Core2Web() {

                System.out.println("In constructor");
        }

	void Core2Web() {
	
		System.out.println("In method");
	}

        public static void main(String[] args) {

                Core2Web c2w = new Core2Web();
                c2w.Core2Web();
        }
}

/*
 * Output
 *
 * In constructor
 * In method
 */
