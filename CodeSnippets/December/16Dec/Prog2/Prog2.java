

final class Parent {

	String var;
}

class Child extends Parent {

        public static void main(String[] args) {

                Child c = new Child();
                System.out.println(c.var);
        }
}

/*
 * Compile time error
 */
