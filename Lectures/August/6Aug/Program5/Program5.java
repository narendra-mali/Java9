

class BreakDemo2 {

        public static void main(String[] args) {

		int i = 1;
                while(i <= 50) {

                        if(i % 5 == 0 && i % 7 == 0)
                                break;
                        else
                                System.out.println("num = " + i);
			i++;
                }

                 System.out.println("Out of loop");
        }
}
