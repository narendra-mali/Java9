

class Program1 {

	public static void main(String[] args) {
	
		int[] score = {56,23,45,75,102};
		int sum = 0;

		for(int i = 0; i < 5; i++) {
		
			sum = sum + score[i];
		}
		
		System.out.println("Total Score = " + sum);
	}
}
