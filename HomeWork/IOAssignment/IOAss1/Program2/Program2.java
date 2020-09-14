

import java.io.*;

class Program2 {

	public static void main(String[] args) throws IOException {

		InputStreamReader ip = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ip);
	
		System.out.println("Enter Team Name : ");
		String name =  br.readLine();
		
		System.out.println("Enter Captain Name : ");
                String capName =  br.readLine();

		System.out.println("Enter Best Win Percentage : ");
                float per = Float.parseFloat(br.readLine());

		System.out.println("Enter Number of Indian batsmen : ");
                int batsmenNo =  Integer.parseInt(br.readLine());

		System.out.println("Enter Number of International batsmen : ");
                int No =  Integer.parseInt(br.readLine());

		System.out.println("The IPL team name is : " + name);
		System.out.println("It’s captain name is : " + capName);
		System.out.println("It has the best win percentage of : " + per);
		System.out.println("Number of Indian batsmen are : " + batsmenNo); 
		System.out.println("Number of International batsmen are : " + No);
	
	}
}
