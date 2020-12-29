

class Outer {

	class Inner extends Outer {
	
	}

	public static void main(String[] args) {
	
		Outer obj = new Outer().new Inner();
	}
}

/*
 * No output
 */
