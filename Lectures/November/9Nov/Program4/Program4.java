

class Zomato {

        void order() {

		final int x = 10;

                class Hotels {

                        void m1() {

                                System.out.println(x);
                        }
                }
                Hotels h = new Hotels();
                h.m1();
        }

	public static void main(String[] args) {
	
		Zomato z = new Zomato();
		z.order();
	}
}

/*
 * if we want to use method's variables inside the inner class then
 * final keyword is used till 1.6 version
 */
