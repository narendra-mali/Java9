

import java.util.*;

class ReverseArray {

    	public static void main(String[] args) {
	   
        	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String str = sc.next();
   		System.out.println(str);

        	System.out.println("Reverse order: ");
       
		char[] carr = str.toCharArray();

        	for (int i = carr.length-1; i >= 0; i--) {
       
	   		System.out.print(carr[i] + " ");
        	}
    	}
}
