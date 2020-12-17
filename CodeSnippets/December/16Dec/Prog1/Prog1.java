

class Parent {

}

class Child extends Parent {

	int num = 10;
	public static void main(String[] args) {
	
		Parent p = new Child();
		Child c = new Child();

		System.out.println(p.num);
	}
}

/*
 * Compile time error
 */
