

class String4 {

        public static void main(String[] args) {

                String s1 = "Core2Web";
                String s2 = new String("Technology");

                System.out.println(s1 + " " + s2);

		String s3;
		
		s3 = s1;
		s1 = s2;
		s2 = s3;

		System.out.println(s1 + " " + s2);
        }
}
