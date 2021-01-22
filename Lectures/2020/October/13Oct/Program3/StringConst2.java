

class StringConst2 {

        public static void main(String[] args) {

                String s1 = "Shashi";
		String s2 = new String("Shashi");
		String s3 = new String("Shashi");

                System.out.println(s1 == s2);		//false
		System.out.println(s2 == s3);           //false

		System.out.println(s1.equals(s2));           //true
                System.out.println(s2.equals(s3));           //true
	}
}

