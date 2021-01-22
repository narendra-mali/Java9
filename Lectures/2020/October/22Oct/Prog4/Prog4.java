

interface Yewale {

	void makingTea();

	default void creamRolls() {
	
		System.out.println("Make own CreamRolls");
	}
}

class PuneYewale implements Yewale {

	public void makingTea() {
	
		System.out.println("Open at 5a.m");
		System.out.println("Best Taste");
	}
}

class BaramatiYewale implements Yewale {

	public void makingTea() {
	
		System.out.println("Open at 7a.m");
                System.out.println("Best Taste");
	}
}

class Sukh {

	public static void main(String[] args) {
	
		Yewale y = new PuneYewale();
		y.makingTea();
		y.creamRolls();

		Yewale y1 = new BaramatiYewale();
                y1.makingTea();
		y1.creamRolls();
	}
}
