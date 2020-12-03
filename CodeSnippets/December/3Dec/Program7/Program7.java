

class BiEncaps {

        BiEncaps() {
	
		System.out.println("You are in BiEncaps constructor");
	}
}

class Core2Web extends BiEncaps {

	Core2Web(int a) {
	
		System.out.println("You are in Core2web Constructor");
	}
}

class Demo {

        public static void main(String[] args) {

                BiEncaps p = new BiEncaps();
		Core2Web c = new Core2Web();
        }
}

/*
 * Compile time error
 */
