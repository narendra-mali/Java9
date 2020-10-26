

import java.util.*;

class StringOccurence {

	public static void main(String[] args) {

		String str,subStr;
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the String : ");
		str = sc.nextLine();
		
		System.out.println("Enter the SubString : ");
		subStr = sc.nextLine();

		int lastindex = 0;

		System.out.println(str.lastIndexOf(subStr));
	}
}
