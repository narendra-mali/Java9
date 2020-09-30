


import java.io.*;

class Array {

	public static void main(String[] args) throws IOException {

		int[] arr = {25,14,56,15,36,56,77,18,29,49};

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pos = Integer.parseInt(br.readLine());
		int len = arr.length;

		for(int i = 0; i < len; i++) {
		
			if(arr[i] == pos) {

			 	System.out.println("Index = " + i);
			}
			else {
				i = i + 1;
			}
		}

	}
}
