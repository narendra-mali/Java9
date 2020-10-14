

import java.util.*;

class SortedArray {
   
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
      
		System.out.println("Enter number of elements : ");
      
		int n = sc.nextInt();
      		int arr1[] = new int[n];
      
		System.out.println("Enter elements : ");
		
		for(int i = 0; i <= n-2; i++) {
         
			arr1[i] = sc.nextInt();
      		}
      
		int sum = (n * (n+1)) / 2;
      		int sumArr = 0;
      
		for(int i = 0; i <= n-2; i++) {
         
			sumArr = sumArr + arr1[i];
      		}
      
		int num = sum - sumArr;
      
		System.out.println("Missing number is : " + num);
   }
}
