

class Demo {

	int var = 100;
	Demo(int var) {
	
		System.out.println("In demo constructor");
	}
}

class Core2Web {

        public static void main(String[] args) {

                Demo d = new Demo();
        }
}

/*
 * error: constructor Demo in class Demo cannot be applied to given types;
 */
