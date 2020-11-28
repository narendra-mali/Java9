

class Core2Web {

        Core2Web(int var1) {

                System.out.println("Int Constructor");
        }

        Core2Web(float var1) {

                System.out.println("Float Constructor");
        }

	Core2Web(String var1) {
	
		System.out.println("String Constructor");
	}

        public static void main(String[] args) {

                Core2Web c2w = new Core2Web();
        }
}

/*
 * Output -
 * no suitable constructor found for Core2Web(no arguments)
 */
