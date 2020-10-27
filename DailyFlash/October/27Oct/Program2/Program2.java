

import java.io.*;

class StringOperations2 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter String : ");
                StringBuilder sb1 = new StringBuilder(br.readLine());

                System.out.print("Enter Concat String : ");
                StringBuilder sb2 = new StringBuilder(br.readLine());

                System.out.println("Concat String is : " + sb1.append(sb2));

                System.out.println("Capacity : " + sb1.capacity());

                System.out.println("Append String : " + sb1.append("Biencaps"));
                System.out.println("Capacity : " + sb1.capacity());
        }
}
