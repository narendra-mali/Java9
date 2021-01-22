

class Outer {

	int x = 10;

	class Inner {

		void xyz() {

			System.out.println("In Inner Class Method");
		}
	}
}

class InnerDemo {
	
	public static void main(String[] args) {

		Outer o = new Outer();
		System.out.println(o.x);

		Outer.Inner i = o.new Inner();
		i.xyz();
	}
}

/*
 * Output :
 *
 * 10
   In Inner Class Method
 */
