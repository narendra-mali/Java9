

class ForWhileDemo {

	public static void main(String[] args) {
	
		int num = 247;
		int rem = 0;
		int sum = 0;

		for( ;num != 0; num = num / 10) {
		
			rem = num % 10;
			sum = sum + rem;
		}

		System.out.println("Sum = " + sum);
	}
}
