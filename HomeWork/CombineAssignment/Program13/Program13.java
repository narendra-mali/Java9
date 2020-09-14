


class Program13 {

    	public static void main(String args[]) {
        
		int num = 9;
        	int sq = num * num;
        	int sum = 0,rem;
        
		while(sq != 0) {
            
			rem = sq % 10;
            		sum = sum + rem;
            		sq = sq / 10;
        	}
        
		if(sum == num)
   
			System.out.println(num + " is a Neon Number");
        
        	else
                	System.out.println(num + " is not a Neon Number");
        
   	 }
}


