

class Core2Web {

	int var1;
	Core2Web() {
	
		var1 = 10;
	}

	final int getVar1() {
	
		return var1;
	}

	int getVar1(int var) {
	
		System.out.println("In getVar1()");
		return var1;
	}

	public static void main(String[] args) {
	
		Core2Web c2w = new Core2Web();
		System.out.println(c2w.getVar1(20));
	}
}
/*
 * In getVar1()
 * 10
 */
