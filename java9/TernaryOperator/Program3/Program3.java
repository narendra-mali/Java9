

class TernaryDemo {

	public static void main(String[] args) {
	
		int x = 25;
		int y = 20;
		int res = 0;
		String ans = null;

		res = (x < y) ? x : y;
		System.out.println(res);	// 20

		System.out.println((x > y) ? x : y);   // 25
	//	res = (x < y) ?  System.out.println("X is Small") :  System.out.println("Y is Greater");      // Error
		
		ans = (x < y) ?  "X is Small" : "Y is Greater";
		System.out.println(ans);

		int a = 25;
                int b = 30;
		int c = 22;

		res = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
                System.out.println(res);

	}
}
