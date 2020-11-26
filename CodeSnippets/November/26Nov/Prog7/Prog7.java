

class Core2Web {

        public static void main(String[] args) throws CloneNotSupportedException {

                Core2Web var1 = new Core2Web();
		Core2Web var2 = (Core2Web)var1.clone();

		System.out.println(System.identityHashCode(var1) + " " + System.identityHashCode(var2));
        }
}

/*
 * Output 
 *
 * Run time exception
 *
 */
