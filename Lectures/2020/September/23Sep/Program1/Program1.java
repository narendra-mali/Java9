

import java.util.*;

class Program1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Integer = ");
		int x = sc.nextInt();
		
		System.out.println("Enter String = ");
		String y = sc.next();
		
		System.out.println("Enter Character = ");
		char ch = sc.next().charAt(0);

		System.out.println("Enter Float Value = ");
		float z = sc.nextFloat();

		System.out.println(x);
		System.out.println(y);
		System.out.println(ch);
		System.out.println(z);
	}
}
