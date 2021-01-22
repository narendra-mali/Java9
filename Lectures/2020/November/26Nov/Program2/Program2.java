

class Core2Web {


}

class Biencaps {


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

		obj.m1(new Core2Web());
		obj.m1(new Biencaps());
	}
}
