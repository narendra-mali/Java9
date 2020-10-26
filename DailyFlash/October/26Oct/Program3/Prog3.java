

import java.util.*;

class MergeString {
	
	public static void main(String[] args) {
 	
        	StringBuilder res = new StringBuilder();

		Scanner sc = new Scanner();
		System.out.println("Enter string1 : ");
		String s1 = sc.nextLine();

		System.out.println("Enter string2 : ");
		String s2 = sc.nextLine();
        
		for (int i = 0; i < s1.length() || i < s2.length(); i++) {
		
			if (i < s1.length())
                
				res = res.append(s1.charAt(i));

                	if (i < s2.length())
         
		 		res = res.append(s2.charAt(i));
        	}

		System.out.println(res);
	}
}
