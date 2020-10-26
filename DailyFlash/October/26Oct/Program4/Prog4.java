

import java.util.*;

class MergeString {

    public static void main(String[] arg){

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter 1st String: ");
            String s1 = sc.nextLine();

            System.out.println("Enter 2nd String: ");
            String s2 = sc.nextLine();

            StringBuilder result = new StringBuilder();

            for (int i = 0,j = s2.length()-1; i < s1.length() || j >= 0; i++, j--) {

                    if (i < s1.length())
                    	result.append(s1.charAt(i));

                    if (j >= 0)
                    	result.append(s2.charAt(j));
            }

            System.out.println(result.toString());

        }
}
