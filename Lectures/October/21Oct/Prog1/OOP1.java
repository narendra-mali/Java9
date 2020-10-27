

class IPLPlayer {

	String pName = "KL Rahul";
	int run2020 = 524;
	static int totalRuns = 5230;


	void playerInfo() {
	
		System.out.println("Player Name = " + pName);
		System.out.println("IPL 2020 rums = " + run2020);
		System.out.println("Total Runs = " + totalRuns);
	}

	public static void main(String[] args) {
	
		IPLPlayer ipl2020 = new IPLPlayer();
		ipl2020.playerInfo();

                System.out.println("Player Name = " + ipl2020.pName);
                System.out.println("IPL 2020 rums = " + ipl2020.run2020);
                System.out.println("Total Runs = " + ipl2020.totalRuns);

	}
}
