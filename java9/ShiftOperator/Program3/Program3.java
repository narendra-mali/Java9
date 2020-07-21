

class UnsignedRightDemo {

	public static void main(String[] args) {
	
		int num = 35;
		int res = 0;
		int num1 = -35;

		res = num >>> 5;
		System.out.println(res);	// 1

		res = num >>> 4;
                System.out.println(res);	// 2

		res = num1 >>> 25;
                System.out.println(res);	// 127
	}
}
