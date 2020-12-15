

class Parent {

	public String toString() {
	
		return "Parent";
	}
}

class Child extends Parent {

	public static void main(String[] args) {
	
		Parent p = new Child();
		System.out.println(p.toString());
	}
}

/*
 * Output-
 * Parent
 */
