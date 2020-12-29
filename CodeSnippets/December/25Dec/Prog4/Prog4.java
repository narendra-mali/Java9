

class Outer {

	void methodOne() {
	
		class Inner {
		
			void m1() {
			
				System.out.println("In m1");
			}
		}
	}

	public static void main(String[] args) {
	
		new B().m1();
	}
}

/*
 * Compile time error
 */
