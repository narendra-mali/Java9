

class StringBufferDemo {

	public static void main(String[] args) {
	
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("Shashi");

		System.out.println(sb1.capacity());
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
	}
}
