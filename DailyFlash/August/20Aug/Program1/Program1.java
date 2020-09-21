

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program1 {

	public static void main(String[] args) throws IOException{
	
		Double hypotenuse;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Side1 = ");
		Double side1 = Double.parseDouble(br.readLine());

		System.out.print("Side2 = ");
		Double side2 = Double.parseDouble(br.readLine());

	        hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));
		System.out.println("Hypotenuse = " + hypotenuse);
				
	}
}
