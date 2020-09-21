


class Pattern5 {

	public static void main(String[] args) {

		for(int row = 6; row >= 1; row--) {

			char ch = 'A';
			for(int col = 1; col <= row; col++) {

				System.out.print(ch + " ");
				ch++;
			}

			System.out.println();
		}

		for(int row = 1; row <= 6; row++) {

			char ch1 = 'A';
			for(int col = 1; col <= row; col++) {

				System.out.print(ch1 + " ");
				ch1++;
			}

			System.out.println();
		}
	}
}
