

class Core2Web {

	int var1 = 10;
	int getVar1() {
	
		return ++var1;
	}

	void getVar1() {
	
		System.out.println("In getVar1()");
		System.out.println(var1);
	}

	public static void main(String[] args) {
	
		Core2Web c2w = new Core2Web();
		c2w.getVar1();
		System.out.println(c2w.getVar1());
	}
}

/*
 * Compile time error
 */
