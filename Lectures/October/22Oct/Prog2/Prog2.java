

class Baba {

	void getProperty() {
	
		System.out.println("Bunglow");
	}

	void career() {
	
		System.out.println("Shashi Doctor Vhava");
	}

	void marry() {
	
		System.out.println("Shashi-> Deepika Padukone");
	}
}

class Shashi extends Baba {

	void career() {
	
		System.out.println("Shashi Teacher & Engg zala");
	}

	void marry() {

                System.out.println("Shashi-> Kriti Sanon");
        }
}

class Kaka {

	public static void main(String[] args) {
	
		Baba b = new Baba();
		b.getProperty();	//Bunglow
		b.career();		//Doctor
		b.marry();		//Shashi-> Deepika Padukone

		Shashi s = new Shashi();
                s.getProperty();        //Bunglow
                s.career();             //Shashi Teacher & Engg zala
                s.marry();              //Shashi-> Kriti Sanon

		Baba b1 = new Shashi();
                b1.getProperty();        //Bunglow
                b1.career();             //Shashi Teacher & Engg Zala
                b1.marry();              //Shashi-> Kriti Sanon
	}
}
