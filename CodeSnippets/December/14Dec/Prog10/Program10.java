

class SuperClass {

	SuperClass(float version) {
	
		System.out.println("Java " + version);
	}

	SuperClass() {
	
		System.out.println("Java 7.0");
	}
}

class SubClass extends SuperClass {

	SubClass(float version) {
	
		super(version);
		System.out.println("Version set");
	}

	public static void main(String[] args) {
	
		new SubClass(11.0f);
	}
}

/*
 * Output -
 * Java 11.0
 * Version set
 */
