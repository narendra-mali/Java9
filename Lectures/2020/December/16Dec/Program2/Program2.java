

class Parent {

       static void m1() {

                System.out.println("In m1 - Parent");
        }
}

class Child extends Parent {

       static void m1() {

                System.out.println("In m1 - Child");
        }

        public static void main(String[] args) {

                Parent p = new Child();
                p.m1();
        }
}

/*
 * In m1 - Parent
 */
