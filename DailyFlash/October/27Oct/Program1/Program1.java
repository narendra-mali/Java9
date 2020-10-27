

import java.io.*;

class StringOperations {

        public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter String : "); 
		StringBuffer sb1 = new StringBuffer(br.readLine());

		System.out.print("Enter Concat String : ");
                StringBuffer sb2 = new StringBuffer(br.readLine());

		System.out.println("Concat String is : " + sb1.append(sb2));
              
                System.out.println("Capacity : " + sb1.capacity());	

		System.out.println("Append String : " + sb1.append("Biencaps"));
		System.out.println("Capacity : " + sb1.capacity());
	}
}
