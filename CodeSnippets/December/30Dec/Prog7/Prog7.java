

class Core2Web {

	static int var1 = 10;
	static int getvar1() {
	
		System.out.println("In getVar1");
		return var1;
	} 

	int getVar1() {
	
		return ++var1;
	}

	public static void main(String[] args) {
	
		Core2Web c2w = new Core2Web();
		System.out.println(c2w.getVar1());
	}
}

/*
 * 11
 */
