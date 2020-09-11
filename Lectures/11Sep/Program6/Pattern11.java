


class PatternDemo11 {

        public static void main(String[] args) {

                int num = 1;
       
                for(int i = 1; i <= 4; i++) {

                        for(int j = 4; j >= i; j--) {

                                if(j == 1 || j == 3) {

                                        System.out.print("*" + " ");
                                }
                                else {
                                        System.out.print(num + " ");
				
                                }
				num++;
                        }

                        System.out.println();
                }
	}
}
