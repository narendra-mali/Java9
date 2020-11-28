

class Core2Web {

        int var = 10;

        Core2Web(int var) {

                this.var = var;
        }

	Core2Web(Core2Web c2w) {
	
		this.var = var;
	}

        public static void main(String[] args) {

                Core2Web c2w1 = new Core2Web(100);
		Core2Web c2w2 = new Core2Web(c2w1);

                System.out.println(c2w1.var);
                System.out.println(c2w2.var);
        }
}

/*
 * Output -
 * 100
 * 10
 */
