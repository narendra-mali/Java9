

class Calculator {

	void add(int a,int b) {
	
		System.out.println("Addition of two operands is : " + (a + b));
	}

	void add(int a,int b,int c) {
	
		System.out.println("Addition of three opeands is : " + (a + b + c));
	}

	public static void main(String[] args) {
	
		Calculator obj = new Calculator();
		obj.add(10,20);
		obj.add(10,20,30);
	}
}
