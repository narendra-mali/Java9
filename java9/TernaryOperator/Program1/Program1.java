

class Cricket {

	public static void main(String[] args) {
	
		Cricket test = new Cricket();
		Cricket oneday = new Cricket();
		Cricket t20 = new Cricket();
		Cricket Thirty5 = null;

		boolean res;

		res = test instanceof Cricket;
		System.out.println(res);			// true

		System.out.println(oneday instanceof Cricket);	// true
                System.out.println(t20 instanceof Cricket);	// true
		System.out.println(Thirty5 instanceof Cricket); // false 
	}
}
