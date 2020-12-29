

class BiEncaps {

	final void printEmployeeDetails() {
	
		System.out.println("There are 25 employee");
	}
}

class Core2Web extends BiEncaps {

	void printEmployeeDetails() {

                System.out.println("There are 25 employee");
        }

	public static void main(String[] args) {
	
		new Core2Web().printEmployeeDetails();
	}
}

/*
 * Compile time error
 */
