

class Core2Web {

	int var1 = 10;

	Core2Web() {
	
		System.out.println("In Constructor");
	}

	int getVar1() {

		return var1;
	}

	int getVar1(int var1) {

		return var1;
	}

	public static void main(String[] args) {

		Core2Web c2w = new Core2Web();
		System.out.println(c2w.getVar1());
		System.out.println(c2w.getVar1(20));
	}
}

/*
 * In Constructor
 * 10
 * 20
 */
