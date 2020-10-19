

import java.io.*;

class StringReplace {

	public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter size of Array : ");
		int size = Integer.parseInt(br.readLine());		

		String arr1[] = new String[size];

		System.out.println("Enter elements : ");

		for(int i = 0; i < size; i++) {

			arr1[i] = br.readLine();
		}

		System.out.println("Elements are : ");
		for(int i = 0; i < size; i++) {

                        System.out.print(arr1[i] + " ");
                 }

		System.out.println("\nFind : ");
		String f = br.readLine();

		System.out.println("Replace : ");
                String r = br.readLine();

		System.out.println("Elements in array :");
		for(int i = 0; i < size; i++) {

                        System.out.println(arr1[i].replace(f,r));
                }
	}
}
