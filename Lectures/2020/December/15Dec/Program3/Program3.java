

class Parent {

        void Property() {

                System.out.println("Property");
        }

        Number career() {

                System.out.println("Doctor");
		return 12;
        }
}

class Child extends Parent {

        Integer career() {

                System.out.println("Engg");
		return 1;
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
