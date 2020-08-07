

class Core2Web {

        public static void main(String[] args) {

                int var1 = 10;
		int var2 = ++var1 + ++var1;

                System.out.println(var1);
		System.out.println(var2);

        }
}

/*
 * var1 = 10
 * var2 = 11 + 12 = 23
 *
 * var1 = 12
 * var2 = 23
 */
