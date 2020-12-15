

class Parent {

        public String toString() {

                return "Parent";
        }
}

class Child extends Parent {

        public static void main(String[] args) {

		Child c = new Child();
                Parent p = new Child();
		System.out.println(p);
		System.out.println(c);
	}
	
	public String toString() {

                return "Child";
        }       
}

/*
 * Child
 * Child
 */
