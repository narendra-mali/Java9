

import java.util.*;

class Program6 {
	
	public static void main(String[] args) {

		int num = 6;
		int i, sum = 0;

		for(i = 1; i < num; i++) {
			
			if(num % i == 0) {
		
				sum = sum + i;
			}
		}	

		if(sum == num) {

			System.out.println(num + " is a Perfect Number");
		}

		else {

			System.out.println(num + " is not a Perfect Number");
		}
	}
}
