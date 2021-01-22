

class BCCI {

	String presName = "Ganguli";
	int years = 2;

	BCCI() {
	
		System.out.println("In BCCI Constructor");
	}
}

class IPL extends BCCI {

	IPL() {
	
		System.out.println("In IPL Constructor");
	}

	IPL(BCCI obj) {
	
		System.out.println("In Parameterized Constructor");
		System.out.println("President = " + obj.presName);
		System.out.println("Years = " + obj.years);
	}
}

class IPL2020 {

	public static void main(String[] args) {
	
		IPL obj1 = new IPL();

		BCCI b = new BCCI();

		IPL obj2 = new IPL(b);
	}
}
