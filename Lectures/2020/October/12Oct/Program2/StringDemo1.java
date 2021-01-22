

class StringDemo1 {

        public static void main(String[] args) {

                String s1 = "Core2Web";                 // scp
                String s2 = new String("Core2Web");     // heap-ref   scp
                String s3 = "Core2Web";                 // scp
                String s4 = new String("Core2Web");     // heap-ref   scp
		String s5 = new String("Biencaps");	// heap-ref   scp
		String s6 = "Biencaps";			// scp

                System.out.println(s5);
                System.out.println(s6);
 
                System.out.println(s5 == s6);           // false
                
		s5 = s5.intern();
		System.out.println(s5 == s6);           // true
        }
}

