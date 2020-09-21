

class AddMul {

	public static void main(String[] args) {
	
		int num = 12345;
		int sum = 0;
		int mul = 1;	
		int rem = 0;

		while(num != 0) {
	
			rem = num % 10;
			if(rem % 2 == 0) 
				sum = sum + rem;
			
			else 
				mul = mul * rem;
		       
			num = num / 10;
		}
		System.out.println("Addition of Even digit is = " + sum);
		System.out.println("Multiplication of Odd digit is = " + mul);
	}
}
