

class Core2Web {

        int var1 = 10;
        
	Core2Web() {

                var1 = 10;
        }

        public int getVar1() {

                return ++var1;
        }

	private int getVar1() {
	
		return var1+10;
	}

        public static void main(String[] args) {

                Core2Web c2w = new Core2Web();
                System.out.println(c2w.getVar1());
        }
}

/*
 * Compile time error
 */
