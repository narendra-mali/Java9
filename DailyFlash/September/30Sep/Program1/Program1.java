

import java.io.*;

class Array {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());

		int[] arr = {1789,2035,1899,2013,1458,2458,1254,1472,2365};

		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == year) {
			 	
				System.out.println("Yes");
			}
		}
	}
}
