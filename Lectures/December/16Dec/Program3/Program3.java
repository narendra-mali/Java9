

class GrandPa {

	void marry() {
	
		System.out.println("Decision");
	}
}

abstract class Father extends GrandPa {

	abstract void marry();
}

class Son extends Father {

	void marry() {
	
		System.out.println("Disha Patni");
	}

	public static void main(String[] args) {
	
		Father f = new Son();
		f.marry();
	}
}

/*
 * Disha Patni
 */
