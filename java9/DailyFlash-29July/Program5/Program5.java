


class Divisible {

	static boolean isDivisible(int n,int m) {
    
		if ((n / m) == ((double)n) / m)
        	    return true;

  		else 
			return false;
    	}
   

    	public static void main(String[] args) {
	
		int divisor,dividend;
	        divisor	= 10;

		if(isDivisible(divisor,dividend = 2)) {
		
			System.out.println("Yes");
		}
		else {
		
			System.out.println("No");
		}

		divisor = 17;
		
		if(isDivisible(divisor,dividend = 2)) {
		
                        System.out.println("Yes");

		}
		else {

                        System.out.println("No");
                }

	}
}
