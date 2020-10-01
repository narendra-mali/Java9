

import java.io.*;

class Program4 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] balls = new int[n * 6];
		int runs = 0,sixes = 0, fours = 0, others = 0, dotballs = 0;

		for(int i = 0; i < (n * 6); i++) {
		
			System.out.print("Enter the runs on ball " +(i + 1) + " : ");
		        balls[i] = Integer.parseInt(br.readLine());
			runs = runs + balls[i];

			if(balls[i] == 6)
			        sixes++;

			else if(balls[i] == 4)
				fours++;

			else if(balls[i] == 0)
				dotballs++;

			else 
				others++;	
		}

		System.out.println("Total score " + runs);
		System.out.println("Total sixes " + sixes);
		System.out.println("Total fours " + fours);
		System.out.println("Other (1/2/3) " + others);
		System.out.println("Total dot balls " + dotballs);	
	}
}
