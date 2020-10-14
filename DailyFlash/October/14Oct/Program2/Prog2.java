
import java.util.*;

class OddArray{

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array :");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter Elements: ");
		for(int i = 0; i < n; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println("Array is:");
		for(int i = 0; i < n; i++){

			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nEnter number : ");
		
		int num = sc.nextInt();
		int count = 0;

		for(int i = 0; i < n; i++){

			if(arr[i] == num){
				
				count += 1;
			}
		}

		System.out.println(num + " Occurs : " + count + " times in an Array");
	}
}
