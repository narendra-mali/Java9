


class Program3 {

	public static void main(String[] args) {
	
		int cnt = 0;
		long rem,n;
		long num = 345669760562L;

		n = num;

		while(n > 0) {
		
			rem = n % 10;
			if(rem == 6) {
			
				cnt = cnt + 1;
			}

			n = n / 10;
		}

		System.out.println("The Occurrence of 6 in number 345669760562 is = " + cnt);
	}
}	
