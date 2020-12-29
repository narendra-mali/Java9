

class Core2Web {

	void method1(long var1) {
	
		System.out.println("In Method1");
	}

	void method1(float var2) {
	
		System.out.println("In Method2");
	}

	public static void main(String[] args) {
	
		Core2Web c2w = new Core2Web();
		c2w.method1(long);
	}
}

/*
 * Compile time error
 */
