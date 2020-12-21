

abstract class Biryani {

	Biryani() {
	
		System.out.println("Biryani Constructor");
	}

	void taste() {

		System.out.println("Best");
	}

	abstract void quantity();
	abstract void price();
}

class PKBiryani extends Biryani {

	PKBiryani() {
	
		System.out.println("PKBiryani Constructor");
	}

	void quantity() {

		System.out.println("More");
	}

	void price() {

		System.out.println("Average");
	}
}

class DorabjiBiryani extends Biryani {

	DorabjiBiryani() {
	
		System.out.println("DorabjiBiryani Constructor");
	}

        void quantity() {

                System.out.println("Less");
        }

        void price() {

                System.out.println("High");
        }
}

class AbstractDemo {

	public static void main(String[] args) {

	//	Biryani b = new Biryani();	Error
		
		Biryani b1 = new PKBiryani();
		b1.quantity();
		b1.price();

		Biryani b2 = new DorabjiBiryani();
		b2.quantity();
		b2.price();
	}
}
