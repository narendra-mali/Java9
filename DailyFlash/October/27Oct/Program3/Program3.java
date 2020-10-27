

import java.io.*;

class StringOperations3 {

        public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter String : "); 
		StringBuffer sb1 = new StringBuffer(br.readLine());

		System.out.print("Insert 1 String : ");
                
		sb1.insert(8,"Technologies");
                System.out.println(sb1);  

		System.out.println("Reverse : ");
		sb1.reverse();

		System.out.println(sb1);

		sb1.reverse();
                System.out.println(sb1);
			
		System.out.println("Replace : ");
                sb1.replace(3,8,"SSS");

                System.out.println(sb1);

		sb1.delete(3,5);
		System.out.println("Delete : " + sb1);

		System.out.println("CharAt : " + sb1.charAt(7));

		System.out.println("Sub String " + sb1.substring(4));
        }
}
