

class Core2Web {

	public static void main(String[] args) {
	
		Core2Web c2w = new Core2Web();

		for(int i = 0; i < 3; i++) 
			c2w.m1();
	}
	void m1() {
	
		int i = 0;
		System.out.println(i++ + " ");
	}
}

/*
 * Output
 *  
 * 0 0 0 
 */
