

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program2 {

	public static void main(String[] args) throws IOException{

		float Simpleinterest;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Principle = ");
		float p = Float.parseFloat(br.readLine());

		System.out.print("Enter rate of interest = ");
		float r = Float.parseFloat(br.readLine());

		System.out.print("Enter time period = ");
                float t = Float.parseFloat(br.readLine());

	        Simpleinterest = (p * r * t) / 100;
		System.out.println("Simple Interest is = " + Simpleinterest);

	}
}

