

class Constructor1 {

	Constructor1() {
	
		System.out.println("In Default Constructor");
		display();
	}

	void display() {
	
		System.out.println("In Display Method");
	}
}

class Demo {

	public static void main(String[] args) {
	
		Constructor1 c = new Constructor1();
		
	}
}
