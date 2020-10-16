

class StringDemo2 {

	public static void main(String[] args) {

		String s1 = new String("Bielearn");
		String s2 = new String("BieMedia");
		String s3 = new String("CivicGen");

                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);

                System.out.println(s1.startsWith("Bie"));        // true
                System.out.println(s2.startsWith("Bie"));        // true
                System.out.println(s3.startsWith("Bie"));	// false
		
		System.out.println(s1.endsWith("earn"));        // true
                System.out.println(s2.endsWith("earn"));        // false
		System.out.println(s3.endsWith("Gen"));        // true
	}
}
		
