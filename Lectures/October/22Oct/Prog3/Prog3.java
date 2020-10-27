

abstract class Baba {

        void getProperty() {

                System.out.println("Bunglow + car");
        }

        abstract void marry();
}

class Shashi extends Baba {

	void marry() {
	
		System.out.println("Kriti Sanon");
	}
}

class Demo {

	public static void main(String[] args) {
	
		Shashi s = new Shashi();
		s.getProperty();
		s.marry();

		Baba b = new Shashi();
		b.getProperty();
                b.marry();
	}
}
