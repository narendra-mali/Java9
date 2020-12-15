

class Parent {

        public String toString() {

		System.out.println(this);
                return "Parent";
        }
}

class Child extends Parent {

        public static void main(String[] args) {

                Child c = new Child();
                System.out.println(c);
        }
}

/*
 * Stack Overflow error
 */
