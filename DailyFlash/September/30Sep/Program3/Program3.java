


class MarksArr {

	public static void main(String[] args) {
	
		int total = 0;
		double per = 0.0;

		int[] marks = {67,72,96,87,55};

		for(int i = 0; i < marks.length; i++) {

			total = total + marks[i];
		}

		System.out.println("Total marks = " + total);
		
	//	double total = total;

		per = total / 5;

		System.out.println("Percentage = " +per);

	}
}
