
import java.util.*;

class Greater {

	public static void main(String[] args) {
	
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number = ");
		num = sc.nextInt();

		if(num == 0){
		
			System.out.println("Entered number is equal to Zero");
		}
		else if(num > 0){
		
			System.out.println("Entered number is greater than 0");
		}
		else{
		
			System.out.println("Entered number is smaller than 0");
		}
	}
}
