

class Parent {

        private String s = "Parent string";
}

class Child extends Parent {

        public static void main(String[] args) {

                Child c = new Child();
                c.m1();
        }

	public void m1() {
	
		System.out.println(s);
	}
}

/*
 * error: s has private access in Parent
 */
