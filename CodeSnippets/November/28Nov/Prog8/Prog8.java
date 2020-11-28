

class Core2Web {

        Core2Web() {

		System.out.println("Normal Constructor");
        }

        Core2Web(float var1) {

                System.out.println("Parametrized Constructor");
        }

        public static void main(String[] args) {

                Core2Web c2w1 = new Core2Web(10);
	}
}

/*
 * Output -
 * Parametrized Constructor
 */
