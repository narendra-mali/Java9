

import java.io.*;

class Program4 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1,num2,num3;

		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());
		num3 = Integer.parseInt(br.readLine());

		if(num1 > num2 && num1 > num3)
			System.out.println(num1 + " is largest number entered amongst " + num1 + " " + num2 + " & " + num3);
	        
		else if(num2 > num1 && num2 > num3) 
			System.out.println(num2 + " is largest number entered amongst " + num1 + " " + num2 + " & " + num3);

		else
			System.out.println(num3 + " is largest number entered amongst " + num1 + " " + num2 + " & " + num3);

	}
}
