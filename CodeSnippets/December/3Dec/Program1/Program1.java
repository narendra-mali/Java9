

class BiEncaps {

	BiEncaps() {
	
		System.out.println("You are in BiEncaps constructor");
	}
}

class Core2Web extends BiEncaps {

	Core2Web() {
	
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
 * Output -
 * You are in BiEncaps constructor
 * You are in BiEncaps constructor
 * You are in Core2Web Constructor
 */
