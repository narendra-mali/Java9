
import java.util.*;

class Palindrome {

	void checkPalindrome(int[] arr){

		System.out.print("Index where palindrome number is present : ");
	
		for(int i = 0; i < arr.length; i++){

			int num = arr[i];
			if(num > 10){

				int ognum,rev = 0,rem;
				ognum = num;

				while(num!=0){

					rem = num % 10;
					rev = rev * 10 + rem;
					num /= 10;
				}
				if(ognum == rev){

					System.out.print(i + " ");
				}
			}
		}
		
		System.out.println();
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.print("\nEnter elements in array: ");

		for(int i = 0; i < n; i++){

			arr[i] = sc.nextInt();
		}

		Palindrome p = new Palindrome();
		p.checkPalindrome(arr);
	}
}
