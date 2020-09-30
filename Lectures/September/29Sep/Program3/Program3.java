


class Program3 {

        public static void main(String[] args) {

                int[] C2W = new int[5];

                C2W[0] = 10;
                C2W[1] = 20;
                C2W[2] = 30;
                C2W[3] = 40;
                C2W[4] = 50;

                for(int i = 0; i < 5; i++) {

                        System.out.println(C2W[i]);
                }

		System.out.println(C2W.getClass());		//class [I  -> special type of class
								//store array of integer

		float[] farr = new float[5];
		System.out.println(farr.getClass()); 		// class [F  -> store array of float

        }
}
