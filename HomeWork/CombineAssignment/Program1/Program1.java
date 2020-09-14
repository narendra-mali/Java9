

import java.util.Scanner;
class Program1 {

	public static void main(String[] args) {
		
		int year;

		System.out.println("Enter year = ");

		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();

		if(year % 4 == 0) {

			if(year % 100 == 0) {

				if(year % 400 == 0) {

					System.out.println("Leap Year");
				}
				else {
					System.out.println("Not Leap Year");
				}
			}
			else {
			
				System.out.println("Not Leap Year");
			}
		}
		else {
		
			System.out.println("Not Leap Year");
		}
			
	}
}
