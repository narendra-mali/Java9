

class StringDemo4 {

        public static void main(String[] args) {

                String s1 = new String("Bielearn");
                String s2 = new String("BieMedia");
                String s3 = new String("BieTickets");

                System.out.println(s1.lastIndexOf('e'));	// 4

		System.out.println(s1.substring(3));		// learn

		System.out.println(s2);
		s2 = s2.substring(3,6);
		System.out.println(s2);				// Med

		System.out.println(s1.toUpperCase());		// BIELEARN
	}
}
