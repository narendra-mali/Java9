

class Reverse {

	public static void main(String[] args) {

		System.out.println("Reverse Order ");

		for(int i = 100; i >= 1; i--) {

			System.out.print(i + ",");

		}

		System.out.println("\nDivisible by 5 ");

		for(int i = 100; i >= 1; i--) {

                        if(i % 5 == 0) {

                                System.out.print(i + ",");
                        }

                }

	}
}
