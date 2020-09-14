


class Pattern2 {

        public static void main(String[] arg) {

		int num = 1;
		char ch = 'A';

                for(int row = 1; row <= 4; row++) {

                        for(int space = 3; space >= row; space--) {

                                System.out.print("  ");
                        }

                        for(int col = 1; col <= row*2-1; col++) {

                                if(row % 2 == 0) 
                        
					System.out.print(ch + " ");
			
                                else
                                        System.out.print(num + " ");
			
                        }
			num++;	
			if(i % 2 == 0)
				ch++;

			System.out.println();
                }
        }
}
