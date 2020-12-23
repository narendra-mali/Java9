

interface MumbaiMarket {

	static void quality() {

		System.out.println("Best Quality");
	}

	void price();
}

class SunilShop implements MumbaiMarket {

	public void price() {

		System.out.println("500-600");
	}
}

class TilakRoadShop implements MumbaiMarket {

        public void price() {

                System.out.println("800-900");
        }
}

class Test {

	public static void main(String[] args) {

		MumbaiMarket obj1 = new SunilShop();
		MumbaiMarket.quality();
		obj1.price();

		MumbaiMarket obj2 = new TilakRoadShop();
                MumbaiMarket.quality();
                obj2.price();
	}
}
