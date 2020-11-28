

class Demo {

        Demo(int a) {

                System.out.println("In int Constructor");
        }

	Demo(Integer a) {
	
		System.out.println("In Integer Constructor");
	}
}

class Core2Web {

        public static void main(String[] args) {

                Demo demo = new Demo(100);
        }
}

/*
 * In int Constructor
 */
