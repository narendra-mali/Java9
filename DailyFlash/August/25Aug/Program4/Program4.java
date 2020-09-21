

import java.util.*;

class Program4 {

        public static void main(String[] args) {

		float sum = 0;
		float avg,num = 0;

		Scanner sc = new Scanner(System.in);
                
		for(int i = 0; i < 10; i++) {

                        num = sc.nextInt();
			sum = sum + num;
                }
		
		avg = sum / num;
		System.out.println("Sum of entered numbers is : " + sum);
		System.out.println("Average of entered numbers is : " + avg);
	}
}
