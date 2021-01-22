


class Outer {

	int a = 10;

	class Inner {
	
		int a = 20;

		void m1() {
		
			int a = 30;

			System.out.println(a);
			System.out.println(this.a);
			System.out.println(Outer.this.a);
		}
	}

	public static void main(String[] args) {
	
		new Outer().new Inner().m1();
	}
}
