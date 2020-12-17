

class Core2Web  {

        class BiEncaps {

                void fun() {

                        System.out.println(this);
                }
        }

        public static void main(String[] args) {

                new Core2Web().new BiEncaps().fun();
        }
}

/*
 * Core2Web$BiEncaps@4aa298b7
 */
