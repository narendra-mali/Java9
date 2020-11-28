

class Core2Web {

	static int var = 10;
	
	Core2Web(int var1) {
	
		var = var1;
	}

	public static void main(String[] args) {
	
		Core2Web c2w = new Core2Web(100);
		System.out.println("var = " + var);
		System.out.println("var = " + c2w.var);
	}
}

/*
 * Output -
 * var = 100
 * var = 100
 */
