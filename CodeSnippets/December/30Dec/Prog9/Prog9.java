

class Core2Web {

        int var1 = 10;

        Core2Web() {

                var1 = 10;
        }

        int getVar1(int var) {

                return ++var1;
        }

        int getVar1(final int var) {

                return var1+5;
        }

        public static void main(String[] args) {

                Core2Web c2w = new Core2Web();
                System.out.println(c2w.getVar1(20));
        }
}

/*
 * Compile time error
 */
