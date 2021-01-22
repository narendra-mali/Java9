

class StringBufferDemo1 {

        public static void main(String[] args) {

		StringBuffer sb2 = new StringBuffer("Biencaps");
                StringBuffer sb1 = new StringBuffer("Shashi");

		//length
                System.out.println(sb1.length());	//6

		//capacity
                System.out.println(sb1.capacity());	//22

		//charAt
		System.out.println(sb1.charAt(3));	//s

		//append
		sb1.append("Bagal");	
		System.out.println(sb1);		//ShashiBagal

		sb1.append(28);
		System.out.println(sb1);		//ShashiBagal28

		sb1.append(sb2);
                System.out.println(sb1);                //ShashiBagal28Biencaps

		sb1.insert(13,"Core2Web");
		System.out.println(sb1);                //ShashiBagal28Core2WebBiencaps

		sb1.deleteCharAt(11);
                System.out.println(sb1);                //ShashiBagalCore2WebBiencaps

		sb1.delete(6,12);
                System.out.println(sb1);                //ShashiCore2WebBiencaps

		sb1.reverse();
		System.out.println(sb1);    

		sb1.reverse();

		sb1.setLength(6);
		System.out.println(sb1);		//Shashi;
        }
}
