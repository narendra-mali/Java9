

class Program23 {
	
	public static void main(String[] args) {

		int num1 = 10, num2 = 15, gcd = 1,lcm;

    		for(int i = 1; i <= num1 && i <= num2; ++i) {
 
			if(num1 % i == 0 && num2 % i == 0)
				
				gcd = i;
    			}

		lcm = (num1 * num2) / gcd;

		System.out.println("The LCM of " + num1 + " and " + num2 + " is = " + lcm);
  	}
}
