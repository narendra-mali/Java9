
/*
 * 	135 = 1 + 3 + 4 = 9
*/

class WhileDemo2 {

	public static void main(String[] args) {
	
		int num = 135;	
		// 135 % 10 = 5 
		// 135 / 10 = 13
		// 13 % 10 = 3
		// 13 / 10 = 1
		// 1 % 10 = 1
		// 1 / 10 = 0

		int rem = 0;
		int sum = 0;

		while(num != 0) {
		
			rem = num % 10;		// rem = 135 % 10 = 5	rem = 13 % 10 = 3	rem = 1 % 10 = 1
			sum = sum + rem;	// sum = 0 + 5 = 5	sum = 5 + 3 = 8		sum = 8 + 1 = 9
			num = num / 10;		// num = 135 / 10 = 13	num = 13 / 10 = 1	num = 1 / 10 = 0 
		}

		System.out.println("Sum of digits is = " + sum);
	}
}
