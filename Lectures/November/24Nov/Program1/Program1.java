

class Parent {

	Parent() {
	
		System.out.println("Parent Constructor");
	}

	void m1() {
	
		System.out.println("Parent's m1");
	}
}

class Child extends Parent {

	Child() {
		
		super();	
		System.out.println("Child Constructor");
	}

	void m1() {
	
		System.out.println("Child's m1");
	}

	public static void main(String[] args) {
	
		Child c = new Child();
	}
}
