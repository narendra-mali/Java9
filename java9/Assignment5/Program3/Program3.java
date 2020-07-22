

class Vote {

	public static void main(String[] args) {
	
		int age = 23;
		int age1 = 15;
		String res = null;

		res = (age > 18 ) ? "Eligible for voting" : "Not eligible for voting";
		System.out.println(age + " = " + res);

		res = (age1 > 18 ) ? "Eligible for voting" : "Not eligible for voting";
                System.out.println(age1 + " = " + res);

	}
}
