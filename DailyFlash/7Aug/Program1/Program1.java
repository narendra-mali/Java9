

class CountDigit {

	public static void main(String[] args) {
	
		int cnt = 0;
		int n = 12345;

		while(n != 0) {
		
			n = n / 10;
			cnt++;
		}

		System.out.println("Output = " + cnt);		
	}
}
