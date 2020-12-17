


class Core2Web  {

        class BiEncaps {

	       static int a = 10;
               
	       void fun() {

                        System.out.println("In fun");
                }
        }

        public static void main(String[] args) {

                new Core2Web().new BiEncaps().fun();
        }
}

/*
 * Compile time error
 */
