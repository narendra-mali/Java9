

class Outer {

	public void m1() {
	
		System.out.println("In Outer m1");
	}

 	class Inner extends Outer {

		public void m1() {
		
			System.out.println("In Inner m1");
		}
        }

        public static void main(String[] args) {

                Outer obj = new Outer().new Inner();
		obj.m1();
        }
}

/*
 * In Inner m1
 */
