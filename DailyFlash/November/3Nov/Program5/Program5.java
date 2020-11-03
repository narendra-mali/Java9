

import java.util.*;

class CheckDate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String str;

		System.out.println("Enter Date(DD/MM/YYYY) : ");
		str = sc.nextLine();

		int date = Integer.parseInt(str.substring(0,2));
		int month = Integer.parseInt(str.substring(3,5));
		int year = Integer.parseInt(str.substring(6));

		if(year > 1900 && year <= 9999) {

			if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			
				days[1]++;
			}
			if(month > 0 && month <= 12) {
			
				if(date > 0 && date < days[month-1]) {
				
					System.out.println("Valid Date");
				}
				else {
					System.out.println("Invalid Date");
				}
			}
			else {
			
				System.out.println("Invalid Date");
			}
		}
		else
			System.out.println("Invalid Date");
	}
}
