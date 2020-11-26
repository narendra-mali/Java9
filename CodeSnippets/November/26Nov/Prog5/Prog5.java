

class Core2Web {

	Core2Web() {
	
		System.out.println("Core2Web");
	}

	Core2Web(String str) {
	
		System.out.println(str);
	}

        public static void mian(String[] args) {

                this("CAFEBABE");
        }
}

/*
 * Output - 
 *
 * Compile Time Error
 */
