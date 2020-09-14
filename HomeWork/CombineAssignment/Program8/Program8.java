

class Program8 {
	
	void prime(int num) {
		
		System.out.print("Prime digits from number " + num + " = ");
		int cnt = 0;
		int x = 0;

		while(num != 0) {
			
			x = num % 10;
			if(x > 1) {
				
				cnt = 0;
				for(int i = 2; i <= (int) x / 2; i++) {
					
					if(x % i == 0) {
						
						cnt = cnt + 1;
						break;
					}
				}
				if(cnt == 0) {
					
					System.out.print(x + " ");
				}
			}
		
			num = num / 10;
		}
		System.out.println();
	}

	public static void main(String[] args) {
	
		Program8 p = new Program8();
		p.prime(141);
		p.prime(237);
		p.prime(544);
	}
	
}
