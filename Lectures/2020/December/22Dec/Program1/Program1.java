

interface RBI {

	void loanType();
	void ROI();
}

class SBI implements RBI {

	public void loanType() {
	
		System.out.println("Home Loan");
	}

	public void ROI() {
	
		System.out.println("8.95");
	}
}

class Customer {

	public static void main(String[] args) {
	
		RBI r = new SBI();
		r.loanType();
		r.ROI();
	}
}

/*
 * Output -
 * Home Loan
 * 8.95
 */
