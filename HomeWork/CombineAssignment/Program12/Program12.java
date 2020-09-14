

class Program12 {

	public static void main(String[] args) {

		int i = 5; int j = 10; int k = 15; boolean ans;
	
		ans = (i < (j - 10)) ? true : false;
		System.out.print("Ans = " + ans + " ");
		System.out.print("i = " + i + " ");
		System.out.print("j = " + j + " ");
		System.out.print("k = " + k);

		ans = (i == (i = j)) ? true : false;
		System.out.print("\nAns = " + ans + " ");
		System.out.print("i = " + i + " ");
                System.out.print("j = " + j + " ");
		System.out.print("k = " + k);

		ans = ((i & j & k) != 0) ? true : false;
		System.out.print("\nAns = " + ans + " ");
		System.out.print("i = " + i + " ");
                System.out.print("j = " + j + " ");
		System.out.print("k = " + k);

		ans = ((i ^ j >> 2) == 0) ? true : false;
		System.out.print("\nAns = " + ans + " ");
		System.out.print("i = " + i + " ");
                System.out.print("j = " + j + " ");
		System.out.println("k = " + k);
	}
}
