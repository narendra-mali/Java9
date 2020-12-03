

class BiEncaps {

        static int noOfEmployee = 25;
}

class Core2Web extends BiEncaps {

        public static void main(String[] args) {

                System.out.println(super.noOfEmployee);
        }
}

/*
 * Compile time error
 */
