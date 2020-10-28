

class CompEngg {

	String name = "Rahul";
	int age = 29;

	CompEngg() {
	
		System.out.println("In Constructor");
	}

	void display() {
	
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
	}
}

class Students {

	public static void main(String[] args) {
	
		CompEngg rahul = new CompEngg();
		rahul.display();

		CompEngg kanha = new CompEngg();
                kanha.name = "Kanha";
		kanha.age = 28;
		kanha.display();
	}
}
