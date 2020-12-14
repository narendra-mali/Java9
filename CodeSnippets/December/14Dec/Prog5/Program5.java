

class SuperClass {

	private SuperClass() {
	
		System.out.println("Private");
	}

	void displayMsg() {
	
		System.out.println("Core2Web");
	}
}

class SubClass extends SuperClass {

	public static void main(String[] arr) {
	
		SubClass obj = new SubClass();
		obj.displayMsg();
	}
}

/*
 * Compile time error
 */
