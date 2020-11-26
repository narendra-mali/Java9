

class Core2Web {

	static {
	
		Core2Web c2w = new Core2Web();
	}

	Core2Web obj = new Core2Web();
	
	public static void main(String[] args) {
	
		System.out.println("Main");
	}

	Core2Web() {
	
		System.out.println("Constructor");
	}
}

/*
 * Output -
 *
 * Runtime exception
 *
 */
