

class SuperClass {

        SuperClass() {

                System.out.println("NASA");
        }
}

class SubClass extends SuperClass {

	SubClass() {
	
		this(100);
		System.out.println("SpaceX");
	}

        SubClass(int var) {

                System.out.println("ISRO");
        }

        public static void main(String arr[]) {

                SubClass obj = new SubClass();
        }
}

/*
 * NASA
 * ISRO
 * SpaceX
 */
