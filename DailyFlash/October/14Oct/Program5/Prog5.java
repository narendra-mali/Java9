

import java.util.*;

class MonotonicArray {

	static boolean checkMonotonic(int[] a) {
	
		int flag = 1;
		
		if(a[0] < a[1]) {
		
			for(int i = 1; i < a.length - 1; i++) {
			
				if(a[i] > a[i+1]) {
				
					flag = 0;
					break;
				}
			}
		}

		else {
		
			for(int i = 1; i < a.length-1; i++) {
			
				if(a[i] < a[i+1]) {
				
					flag = 0;
					break;
				}
			}
		}

		if(flag == 1) 
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
	
		MonotonicArray obj1 = new MonotonicArray();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array elements : "); 
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + "elemets in array : ");
	       	
		for(int i = 0 ; i < arr.length; i++) {
		
			arr[i] = sc.nextInt();
		}

		if(obj1.checkMonotonic(arr)) 

			System.out.println("Array is monotonic");
		else
			 System.out.println("Array is not monotonic");
	}
}
