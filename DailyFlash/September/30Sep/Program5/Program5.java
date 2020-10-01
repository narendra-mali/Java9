


import java.io.*;

class Array {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] z = new int[n];
		int pos = 0,neg = 0,odd = 0,even = 0,zero = 0;

		for(int i = 0; i < n; i++) {
		
			int z[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i < z.length; i++) {
		
			if(z[i] > 0) {
			
				pos++;
			}
			else if(z[i] < 0) {
			
				neg++;
			}
			else {
				zero++;
			}

			if(z[i] % 2 == 0) {
			
				even++;
			}
			else
				odd++;
		}

		System.out.println("Positive = " + pos + "\n Negative = " + neg + "\nZero = " + zero + "\nOdd = " + odd + "\nEven = " + even); 
	}
}
