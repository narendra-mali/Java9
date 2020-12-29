

class Outer {

	String str = "Hello";
	static class Inner {
	
		String str = "Hey";
		public void m1() {
		
			System.out.println(str);
		}
	}
}

class Test {

	public static void main(String[] args) {
	
		System.out.println(new Outer().str);
		System.out.println(new Outer.Inner().str);

		new Outer.Inner().m1();
	}
}
/*
 * Hello
 * Hey
 * Hey
 *
