

class Core2Web {

        protected Core2Web(String ... str) {

                System.out.println("Iphone0S");
        }

        private Core2Web(String str) {

                System.out.println("Oxygen0S");
        }

	Core2Web() {

                System.out.println("HarmonyOS");
        }

        public static void main(String[] args) {

		new Core2Web("");
		new Core2Web(new String());
        }
}

/*
 * Output -
 *
 * OxygenOS OxygenOS
 *
 */
