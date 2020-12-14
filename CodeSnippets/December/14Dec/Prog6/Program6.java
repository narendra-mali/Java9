

class SuperClass {

        void displayMsg() {

                System.out.println("Core2Web");
        }
}

class SubClass {

	SubClass() {
	
		System.out.println("SubClass");
	}

        public static void main(String[] arr) {

                SuperClass obj = new SubClass();
                obj.displayMsg();
        }
}

/*
 * Compile time error
 */
