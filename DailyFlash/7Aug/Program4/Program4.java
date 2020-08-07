

class MaxDig {

	public static void main(String[] args) {
	
		int num = 12347798;
		int rem;
		int max = 0;

		while(num != 0) {
		
			rem = num % 10;

			if(rem > max)
				max  = rem;
			
			num = num / 10;
		}
		System.out.println("Maximum Digit from number 12347798 " +"is = " + max);
	}
}
