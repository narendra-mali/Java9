


class Parent {

	public static void grapes() {
	
		System.out.println("In Parent grapes");
	}
}

class Child extends Parent {

	public static void grapes() {
	
		System.out.println("In Child Grapes");
	}
}

class Core2Web {

	public static void main(String[] args) {
	
		Parent obj = new Child();
		obj.grapes();
	}
}

/*
 * In Parent grapes
 */
