

class BreakDemo {

	public static void main(String[] args) {
	
		for(int i =1; i <= 50; i++) {
		
			if(i % 5 == 0 && i % 7 == 0) 
				break;
			else
				System.out.println("num = " + i);
		}

		 System.out.println("Out of loop");
	}
}
