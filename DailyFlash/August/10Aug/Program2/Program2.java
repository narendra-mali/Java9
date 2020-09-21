

class Addition {

	public static void main(String[] args) {
	
		int sum = 0;
		int n = 10;
		for(int i = 1; i <= 10; i++) {
		
			sum = i + n;
			System.out.println(i + " + " + n + " = " + sum);
			n--;
		}
		
	}
}
