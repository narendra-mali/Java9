

class StringDemo {

	public static void main(String[] args) {
	
		String s1 = "Core2Web";			// scp
		String s2 = new String("Core2Web");	// heap-ref   scp
		String s3 = "Core2Web";                 // scp
                String s4 = new String("Core2Web");     // heap-ref   scp

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		System.out.println(s1 == s2);		// false
		System.out.println(s1 == s3);           // true
        	System.out.println(s2 == s4);           // false

	}
}
