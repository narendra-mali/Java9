

import java.io.*;

class ReverseArr {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number = ");
		int num = Integer.parseInt(br.readLine());

		int[] revarr = new int[num];

		System.out.println("Enter elemenst = ");
		for(int i = 0; i < num; i++) {
		
			revarr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Reverse Array = ");
		for (int i = revarr.length-1; i >= 0; i--) {
		
			System.out.print(revarr[i] + " ");
		}
	}
}
