

class Core2Web {


}

class Biencaps extends Core2Web {


}

class Demo {

	void m1(Core2Web c2w) {

		System.out.println("Core2Web method");
	}

	void m1(Biencaps bie) {

		System.out.println("Biencaps method");
	}
}

class Test {

	public static void main(String[] args) {

		Demo obj = new Demo();
		Core2Web c2w = new Core2Web();

		obj.m1(c2w);
		
		Biencaps bie = new Biencaps();
		obj.m1(bie);

		Core2Web cobj = new Biencaps();
		obj.m1(cobj);
	}
}
