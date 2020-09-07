


class Pattern20 {

        public static void main(String arg[]) {

		int num = 7;
		for (int i = 4; i >= 1; i--) {

			for (int j = i; j <= 4; j++) {

				System.out.print(num + " ");
				num--;
   			}

   			System.out.println();
			num++;
		}
	}
}

