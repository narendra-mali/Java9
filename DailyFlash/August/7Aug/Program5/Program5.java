

class Average {

	public static void main(String[] args) {
	
		int num = 12345,avg = 0;
		int rem = 0, sum = 0,cnt = 0;

		while(num != 0) {
		
			rem = num % 10;
			cnt++;
			sum = sum + rem;
			num = num / 10;
			
		avg = sum / cnt;	
		}

		System.out.println("Average of num = " + avg);
	}
}
