

class Outer {
	
	class Inner1 {

		class Inner2 {
		
			void m1() {
			
				System.out.println("In Inner2 Class");
			}
		}
	}

	public static void main(String[] args) {
	
		new Outer().new Inner1().new Inner2().m1();
	}
}

/*
 * Output
 *
 * In Inner2 Class
 *
 */
