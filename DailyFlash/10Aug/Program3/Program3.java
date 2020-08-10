

import java.util.Scanner;

class PrimeSeries {

	public static void main(String[] args) {
	
		int num;
		
		System.out.println("Enter Number = ");

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for(int i = 1; i <= num; i++) {
		
			int cnt  = 0;
			for(int j = 1; j <= i; j++){
				
				if(i % j == 0)
					cnt++;
			}
	
		if(cnt == 2) 
		
			System.out.print(i + " ");
		}	
	}
}
