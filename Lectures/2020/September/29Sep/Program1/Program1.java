


class Program1 {

	public static void main(String[] args) {

		int jarr[] = {1,2,3,4,5};

		for(int i = 0; i < 5; i++) {

                        System.out.println(jarr[i]);
                }

		jarr[0] = 10;
		jarr[1] = 20;
		jarr[2] = 30;
		jarr[3] = 40;
		jarr[4] = 50;

		for(int i = 0; i < 5; i++) {

			System.out.println(jarr[i]);
		}
	}
}
