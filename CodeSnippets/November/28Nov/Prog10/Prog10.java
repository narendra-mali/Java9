

class Core2Web {

	int var1 = 10;
	
	Core2Web(int var1) {
	
		var1 = var1;
	}

	int getVar() {
	
		return var1;
	}

	public static void main(String[] args) {
	
		Core2Web c2w = new Core2Web(100);
		System.out.println(c2w.getVar());
	}
}

/*
 * Output - 
 * 10
 */
