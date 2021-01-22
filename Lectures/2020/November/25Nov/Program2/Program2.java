

class AddDemo {

	void add(int a,int b) {
	
		System.out.println(a + b);
	}

	void add(int a,int b,int c) {
	
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
	
		AddDemo obj = new AddDemo();
		obj.add(10,20,30);
		obj.add(40,50);
	}
}
