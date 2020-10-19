

class Core2Web {

        public static void main(String[] args) {

                Object[] var1 = new Core2Web[3];

                var1[0] = new Core2Web();
                var1[1] = new Core2Web();

                if(var1[0] instanceof Core2Web)
                        System.out.println("Instance of Core2Web");
		else
			System.out.println("ObjectInstance");
        }
}

/*
 * Output -
 *
 * Instance of Core2Web
 *
 */
