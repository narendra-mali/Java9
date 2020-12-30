

class Core2Web {

        int var1;

        Core2Web() {

                var1 = 10;
        }

        int getVar1() {

                return var1++;
        }

        float getVar1(float var1) {

                return ++var1;
        }

        public static void main(String[] args) {

                Core2Web c2w = new Core2Web();
		System.out.println(c2w.getVar1());
                System.out.println(c2w.getVar1(90.0f));
		System.out.println(c2w.var1);
        }
}

/*
 * 10
 * 91.0
 * 11
 */
