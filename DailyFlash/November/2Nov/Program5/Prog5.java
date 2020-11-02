

class Mall {

	int floors = 3;
	String name = "CCM";

	Mall() {
	
		System.out.println("\nIn Mall Constructor");
		System.out.println("Name of Mall : " + name);
		System.out.println("Number of Floors in Mall : " + floors);	
	}
}

class Shopping extends Mall {

	Shopping() {
	
		System.out.println("\nIn Shopping Constructor1");
	}
	Shopping(Mall obj) {
	
		System.out.println("\nIn Shopping Constructor2");
		System.out.println("Name of Mall : " + obj.name);
                System.out.println("Number of Floors in Mall : " + obj.floors);
	}
}

class Area {

	public static void main(String[] args) {
	
		Shopping s1 = new Shopping();

		Mall m1 = new Mall();
		Shopping s2 = new Shopping(m1);

	}
}
