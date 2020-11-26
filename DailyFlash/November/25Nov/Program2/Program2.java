

class X {

	//static int a=10;
	
	class Y {

		static int a = 10;  //error because of static declaration inside inner class
		static final int b = 20;

		void printValues() {

			System.out.println("a = " + a + " b = " + b);
		}
	}

	public static void main(String[] args){

		X x = new X();
		Y y = x.new Y();
		y.printValues();
	}
}

/* 
 * Error occurs in this program because we cannot declare static inside inner class,
   inner classes cannot have static declarations because it is an instance
   but we can access the static in inner class by deaclaring it in outer class.
*/
