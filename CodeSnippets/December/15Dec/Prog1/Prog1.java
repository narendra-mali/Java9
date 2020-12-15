

class Core2Web1 {

	int m1() {
	
		return 100;
	}
}

class Core2Web2 extends Core2Web1 {

	private void m1() {
	
		System.out.println("In M1");
	}

	public static void main(String[] arr) {
	
		Core2Web2 c2w = new Core2Web2();
		c2w.m1();
	}
}

/*
 * attempting to assign weaker access privileges; was package
 */
