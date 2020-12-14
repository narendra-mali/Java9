

class SuperClass {

	void error() {
	
		System.out.println("101");
	}

	String err = "404";
}

class SubClass extends SuperClass {

	public static void main(String arr[]) {
	
		SuperClass obj = new SubClass();
		System.out.println(obj.err);
		obj.error();
	}
}

/*
 * Output-
 * 404
 * 101
 */
