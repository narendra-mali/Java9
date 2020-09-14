

class Program4 {

	public static void main(String[] args) {
	
		int arr[] = {455,800,56,39,290,18,383,3,290,29,10};
		int largeNo = arr[0];
		int secLarge = arr[0];
		
		System.out.println("Array : ");

	for(int i = 0; i < arr.length; i++) {
		
		System.out.print(arr[i] + " ");
	}

	for(int i = 0; i < arr.length; i++) {
	
		if(arr[i] > largeNo) {

			secLarge = largeNo;
			largeNo = arr[i];
		}
		else if(arr[i] > secLarge) {
		
			secLarge = arr[i];
		}	
	}

	System.out.println("\nSecond largest number is = " + secLarge);
	}

}
