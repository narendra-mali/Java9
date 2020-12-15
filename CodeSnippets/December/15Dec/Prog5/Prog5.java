

class Parent {

        public void m2() {

                System.out.println(this);
        }
}

class Child extends Parent {

        public static void main(String[] args) {

                Parent p = new Child();
                p.m2();
        }
}

/*
 * Output-
 * Child@4aa298b7
 */
