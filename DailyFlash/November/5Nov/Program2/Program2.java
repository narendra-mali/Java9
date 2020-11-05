

import java.util.*;

class StringLength {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter String : ");
                String str = sc.next();
                System.out.println(str);

                System.out.println("String Length : ");

		int len = str.length();

                char[] carr = str.toCharArray();
		int strLen = carr.length;

                System.out.print(strLen + " ");
        }
}
