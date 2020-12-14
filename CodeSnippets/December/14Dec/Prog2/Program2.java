

class SuperClass {

	protected SuperClass(String str) {
	
		System.out.println("OpenAI");
	}
}

class SubClass extends SuperClass {

	private SubClass(String str) {
	
		System.out.println("Neuralink");
	}

	public static void main(String arr[]) {
	
		SubClass obj = new SubClass("Elon");
	}
}

/*
 * Compile time error
 */
