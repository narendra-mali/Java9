
class BiEncaps {

	BiEncaps() {
	
		System.out.println("In BiEncaps default");
	}

	BiEncaps(int a) {
	
		System.out.println("In BiEncaps paramertised");
	}
}

class Core2Web extends BiEncaps {

	Core2Web() {
	
		this(10);
		super(10);
		System.out.println("Normal Constructor");
	}

	Core2Web(int a) {
	
		System.out.println("Parametrised Constructor");
	}

	public static void main(String[] args) {
	
		Core2Web c2w = new Core2Web();
	}
}
