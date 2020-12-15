

class Parent {

        public void m1() {

                System.out.println("In parent m1");
        }
}

class Child extends Parent {

        public static void main(String[] args) {

                Parent p = new Child();
                p.m2();
        }

	public void m2() {
	
		System.out.println("In child m2");
	}
}

/*
 * error : cannot find symbol
 */
