

class Core2Web1 {

	static int var = 100;
}

class Core2Web2 extends Core2Web1 {

	public static void main(String[] arr) {
	
		m1();
	}

	public static void m1() {
	
		System.out.println(var);
		System.out.println(super.var);
	}
}

/*
 *  error: non-static variable super cannot be referenced from a static context
 */
