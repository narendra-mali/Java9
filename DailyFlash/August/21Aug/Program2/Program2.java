

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program2 {

	public static void main(String[] args) throws IOException {

		int unit;
		double amt = 1, total_amt, charge;
       		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter units : ");
                unit = Integer.parseInt(br.readLine());

		if(unit <= 50)
			amt = unit * 0.50;

		else if(unit <= 150)
			amt = 25 + ((unit-50) * 0.75);

		else if(unit <= 250)
			amt = 100 + ((unit-150) * 1.20);

		charge = amt * 0.20;
		total_amt = amt + charge;

		System.out.println("Electricity Bill = " + total_amt);
	}
}
