

class Core2Web {

        public static void main(String[] args) {

                int arr[][] = new int[2][2];

                for(int i = 0; i < 2; i++) {

                        for(int j = 0; j < arr[i].length; j++)

                                arr[i][j] = i * j;
                        }


                for(int i = 0; i < arr.length; i++) {

                        for(int j = 0; j < arr[i].length; j++)

                                System.out.print(arr[i][j] + " ");

                        System.out.println();
                }
        }
}

/*
 * Output -
 *
 * 0 0 
 * 0 1
 *
 */
