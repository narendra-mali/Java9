

class StringDemo1 {

        public static void main(String[] args) {

                String s1 = new String("Shashi");
                String s2 = new String("Bagal");

                s1 = s1.concat(s2);

                System.out.println(s1);         // ShashiBagal
                System.out.println(s2);         // Bagal

                
        }
}
