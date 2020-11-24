

class Zomato {

	int x = 10;
	static int y = 20;

	void order() {

		class Hotels {

			void m1() {
			
				System.out.println(x);
				System.out.println(y);
			}
		}
		Hotels h = new Hotels();
	        h.m1();
	}

	static void goOut() {

		class Hotels {

			void m1() {
			
			//	System.out.println(x);		//Error 
                                System.out.println(y);
			}
		}

		Hotels h = new Hotels();
		h.m1();
	}
	public static void main(String[] args) {

		Zomato z = new Zomato();
		z.order();

		z.goOut();
	}
}

/*
 * Output -
 * 10
 * 20
 * 20
 */
