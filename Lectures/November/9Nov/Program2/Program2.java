

class Zomato {

	static void order() {

		System.out.println("In Ordered Method");

		class Hotels {

			String hotelName = null;

			Hotels(String hotelName) {

				this.hotelName = hotelName;
			}

			void orderPalced() {

				System.out.println("Hotels : " + hotelName);
			}
		}

		Hotels h = new Hotels("Green Park");
		h.orderPalced();
	}

	public static void main(String[] args) {

	//	Zomato z = new Zomato();
	//	z.order();
		order();
	}
}
