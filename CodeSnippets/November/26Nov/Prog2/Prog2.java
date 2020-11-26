

class Core2Web {

        static {

                Core2Web c2w = new Core2Web();
        }

        String str = new Core2Web.fun();

	static String fun() {
	
		System.out.println("FUN");
		return "fun";
	}

        public static void main(String[] args) {

                System.out.println("Main");
        }

        Core2Web() {

                System.out.println("Constructor");
        }
}

