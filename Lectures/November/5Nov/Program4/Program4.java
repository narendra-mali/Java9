

class Outer {

        int x = 10;
	static int y = 20;

	void OuterM1() {
	
		System.out.println("In Outer M1");
	}

	static void OuterM2() {

                System.out.println("In Outer M2");
        }

        class Inner {

                void InnerM1() {

                        System.out.println(x);
			System.out.println(y);
			OuterM1();
			OuterM2();
                }
        }

        public static void main(String[] args) {

                new Outer().new Inner().InnerM1();
        }
}

/*
 * Output :
 *
 * 10
 * 20
 * In Outer M1
 * In Outer M2
 */
