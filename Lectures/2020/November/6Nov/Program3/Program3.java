

class Outer {

	class Inner {
	
		void m1() {
		
			System.out.println("In Inner Class m1 ");
		}
	}

	public static void main(String[] args) {
	
		Outer o = null;			//Runtime Error NullPointerException
		Inner i = o.new Inner();
		i.m1();
	}
}
