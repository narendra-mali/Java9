

class SuperClass {

	SuperClass() {
	
		System.out.println("Guido");
	}
}

class SubClass extends SuperClass {

	String founder() {
	
		return "James Gosling";
	}

	public static void main(String[] arr) {
	
		SuperClass obj = new SuperClass();
		System.out.println(obj.founder());
	}
}

/*
 * Compile time error
 */
