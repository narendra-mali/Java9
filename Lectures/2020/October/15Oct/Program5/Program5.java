

class StringBufferDemo1 {

        public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
                StringBuffer sb1 = new StringBuffer("Pune");
                StringBuffer sb2 = new StringBuffer("Phaltan");
                StringBuffer sb3 = new StringBuffer("Baramati");

		System.out.println(sb);
                System.out.println(sb1);		// obj created only on Heap
		System.out.println(sb2);
		System.out.println(sb3);

		sb.append("Core2Web");
		sb1.append(" MH-12");
		sb2.append(" MH-11");
		sb3.append(" MH-42");

		System.out.println(sb);
                System.out.println(sb1);                
		System.out.println(sb2);
                System.out.println(sb3);

	}
}
