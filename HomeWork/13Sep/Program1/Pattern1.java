


class Pattern1 {

        public static void main(String[] arg) {

                for(int row = 1; row <= 4; row++) {

                        for(int space = 3; space >= row; space--) {

                                System.out.print("  ");
                        }

                        for(int col = 1; col <= row*2-1; col++) {
				
				if(row % 2 == 0)
                                
					System.out.print("=" + " ");
				else
					System.out.print("*" + " ");
                        }

                        System.out.println();
                }
        }
}
