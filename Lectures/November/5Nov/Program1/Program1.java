

class Outer {

	int x = 10;

	class Inner {
	
		void xyz() {
		
			System.out.println("In Inner class Method");
		}
	}

	public static void main(String[] args) {
	
	//	Outer o = new Outer();
		System.out.println(new Outer().x);

	//	Inner i = new Outer().new Inner();
	//	i.xyz();

		new Outer().new Inner().xyz();
	}
}
