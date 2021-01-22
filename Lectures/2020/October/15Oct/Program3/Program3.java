

class StringDemo3 {

        public static void main(String[] args) {

                String s1 = new String("Bielearn");
                String s2 = new String("BieMedia");
                String s3 = new String("BieTickets");

		System.out.println(s1.indexOf('l'));		// 3
		System.out.println(s1.indexOf('e',3));    	// 2
		System.out.println(s1.indexOf("learn"));    	// 3
		System.out.println(s1.indexOf("earn",5));    	// -1
		System.out.println(s1.indexOf("earn",4));       // 4
	}
}
