

class Divisible {

        public static void main(String[] args) {

                int i = 1;
		int cnt = 0;

                while(cnt != 10) {

                        if((i % 32 == 0) && (i % 7 == 0)) {
                        
				System.out.print(i + " ");
				cnt++;
			
				if(i % 6 == 0)
					break;
			}
			i++;
                 }

        }
}

