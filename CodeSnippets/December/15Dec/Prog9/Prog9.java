

class Parent {

	private String s = "Parent string";
        public void m1() {

                System.out.println(s);
        }
}

class Child extends Parent {

        public static void main(String[] args) {

                Child c = new Child();
                c.m1();
        }
}

/*
 * Output -
 * Parent string
 */
