


interface A {

        void m1();
}

interface B {

        void m1();
}

class C implements A,B {

        public void m1() {

		System.out.println("Interface example");
        }

	public static void main(String[] args) {
	
		C obj = new C();
		obj.m1();
	}
}

