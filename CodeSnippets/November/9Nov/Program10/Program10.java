

class Core2Web {

	static int i = 0;

	public static void main(String[] args) {
	
		Core2Web c2w = new Core2Web();

		for(int j = 0; j < 3; j++) 
			c2w.m1();
	}
	void m1() {
	
		int i = 0;
		System.out.print(i++ + " ");
	}
}

/*
 * Output
 *
 * 0 0 0
 */
