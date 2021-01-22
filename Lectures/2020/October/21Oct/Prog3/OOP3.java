

class BCCI {

	int x = 10;

	BCCI() {
	
		System.out.println("In BCCI Constructor");
	}

	void rulesBCCI() {
	
		System.out.println("Rules by BCCI");
	}
}

class IPL extends BCCI {

	int y = 20;

	IPL() {
	
		System.out.println("In IPL Constructor");
	}

	void rulesIPL() {
	
		System.out.println("Rules by IPL");
	}
}

class Match {

	public static void main(String[] args) {
	
		IPL ipl2020 = new IPL();
		ipl2020.rulesIPL();		
		ipl2020.rulesBCCI();

		BCCI obj = new BCCI();
             //	obj.rulesIPL();			//Error
                obj.rulesBCCI();		
	}
}
