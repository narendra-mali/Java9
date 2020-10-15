

class CompareStrings {

	public static void main(String[] args) {
	
		String s1 = "Shashi";
		String s2 = new String("Shashi");
		String s5 = new String("SHASHI");
		String s3 = "Biencaps";
		String s4 = new String("Bielearn");
		String s6 = "Shashikant";

		System.out.println(s1.equals(s2));	// true
		System.out.println(s1.equals(s5));	// false

		System.out.println(s1.equalsIgnoreCase(s5));	// true

		System.out.println(s1.compareTo(s2));	// 0

		System.out.println(s3.compareTo(s1));   // -17
		System.out.println(s1.compareTo(s6));   // -4
		
		System.out.println(s3.compareTo(s4));   // 2
	}
}
