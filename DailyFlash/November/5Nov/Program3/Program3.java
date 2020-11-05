

import java.util.*;

class AnagramString {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter String 1 : ");
                String str1 = sc.nextLine();
                
                System.out.println("Enter second String 2 : ");
    		String str2 = sc.nextLine();
	
    		if(str1.length() == str2.length()) {

      			char[] charArray1 = str1.toCharArray();
      			char[] charArray2 = str2.toCharArray();

		        Arrays.sort(charArray1);
      			Arrays.sort(charArray2);
	
      			boolean result = Arrays.equals(charArray1, charArray2);

			if(result) {
        			System.out.println(str1 + " and " + str2 + " are anagram.");
      			}
      			
			else {
        			System.out.println(str1 + " and " + str2 + " are not anagram.");
      			}
    		}
    
		else {
      			System.out.println(str1 + " and " + str2 + " are not anagram.");
    		}

		sc.close();
        }
}
