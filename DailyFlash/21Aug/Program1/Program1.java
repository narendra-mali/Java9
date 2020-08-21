

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program1 {

	public static void main(String[] args) throws IOException {

		int r;
		double pi = 3.14, area;
       		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter radius : ");
                r = Integer.parseInt(br.readLine());

		area = pi * r * r;
                System.out.println("Area of circle : " + area);
	}
}
