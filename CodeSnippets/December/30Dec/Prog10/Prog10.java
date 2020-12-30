

class Core2Web {

        int var1 = 10;

        Core2Web() {

                var1 = 10;
        }

        int getVar1(Core2Web obj) {

                return ++var1;
        }

        int getVar1(Object obj) {

                return var1+10;
        }

        public static void main(String[] args) {

                Core2Web c2w = new Core2Web();
		System.out.println(c2w.getVar1(10));
                System.out.println(c2w.getVar1(20));
        }
}

/*
 * 20
 * 20
 */
