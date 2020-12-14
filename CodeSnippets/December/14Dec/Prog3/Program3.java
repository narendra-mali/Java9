

class SuperClass1 {

        protected SuperClass1() {

                System.out.println("ReactJS");
        }
}

class SuperClass2 {

	protected SuperClass2() {
	
		System.out.println("Spring");
	}
}

class SubClass extends SuperClass1, SuperClass2 {

        private SubClass() {

                System.out.println("Assembly");
        }

        public static void main(String arr[]) {

                SubClass obj = new SubClass();
        }
}

/*
 * Compile time error
 */
