

import java.io.*;

class IPLTeam {

	int jerNum,cntTrophies;
        String tName,fOwner,cName;

	public static void main(String[] args) throws IOException {

		IPLTeam ipl = new IPLTeam();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Team Name = ");
		ipl.tName = br.readLine();
	
		System.out.println("Enter Captian Name = ");
		ipl.cName = br.readLine();

		System.out.println("Enter Jersey Number of " + ipl.cName + " is = ");
                ipl.jerNum = Integer.parseInt(br.readLine());
	
		System.out.println("Enter Franchise Owner = ");
                ipl.fOwner = br.readLine();
	
		System.out.println("Enter count of Trophies Won by " + ipl.tName + " is = ");
                ipl.cntTrophies = Integer.parseInt(br.readLine());
		
		System.out.println("Team Name = " + ipl.tName);
		System.out.println("Captian Name = " + ipl.cName);
		System.out.println("Jersey number = " + ipl.jerNum);
		System.out.println("Franchise Owner = " + ipl.fOwner);
		System.out.println("Number of Trophies Won = " + ipl.cntTrophies);
	}
}
