

class Program16 {

	public static void main(String[] args) {
	
		System.out.println("Self dividing number from 1 to 100 = ");
		int i = 0;

		while(i <= 100){
		
			int n = 0;
			int num = i;
			int flag = 0;

			while(i > 0) {
			
				n = i % 10;
				if(n > 0) {
				
					if(num % n != 0) {
					
						flag = 0;
						break;
					}
					else
						flag = 1;
				}

				i = i / 10;
			}

			if(flag == 1) 
				System.out.print(num + " ");
			i = num;
			i++;
		}
		System.out.println();
	}
}
