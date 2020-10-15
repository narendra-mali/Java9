

class StringDemo {

        public static void main(String[] args) {

                String s1 = "Shashi";
                String s2 = "Bagal";

		s1.concat(s2);

		System.out.println(s1);		// Shashi
		System.out.println(s2);		// Bagal
		
		System.out.println(s1.concat(s2));	// ShashiBagal
	}
}
