

class Core2Web {

        int var1;

        Core2Web() {

                var1 = 10;
        }

        void getClass() {

		System.out.println("getClass " + "Core2Web");
        }

        String getClass(float num) {

                System.out.println("getClass " + "Core2Web");
                return new String("BiEncaps");
        }

        public static void main(String[] args) {

                Core2Web c2w = new Core2Web();
                System.out.println(c2w.getClass(45));
        }
}

/*
 * Compile time error
 */
