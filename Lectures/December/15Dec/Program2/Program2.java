

class Parent {

        void Property() {

                System.out.println("Property");
        }

        String career() {

                System.out.println("Doctor");
        }
}

class Child extends Parent {

        Object career() {

                System.out.println("Engg");
        }
}

class Test {

        public static void main(String[] args) {

                Parent p = new Parent();
                p.career();

                Child c = new Child();
                c.career();

                Parent p1 = new Child();
                p1.career();
        }
}

/*
 * return type Object is not compatible with String
 */
