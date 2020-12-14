

class Core2Web extends Core2Web {

	Core2Web() {
	
		System.out.println("C2W");
	}

	public static void main() {
	
		Core2Web c2w = new Core2Web();
	}
}

/*
 * error: cyclic inheritance involving Core2Web
 */
