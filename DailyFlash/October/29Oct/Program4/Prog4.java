
import java.io.*;

interface Team {

	void getPlayerNum();
	void getPlayerName();

	default void winLoss () {

		int win = 8;
		int lose = 2;

		System.out.println("Win : " + win);
		System.out.println("Loss : " + lose);
	}
}

class CSK implements Team {

	public void getPlayerNum() {

		System.out.println("Number of Players = 10");
	}

	public void getPlayerName() {

		System.out.println("Player Name is = M.S.Dhoni");
	}
}

class RCB implements Team {

	public void getPlayerNum() {

		System.out.println("Number of Players = 12");
	}

	public void getPlayerName() {

		System.out.println("Player Name = Virat Kolhi");
	}
}

class MainTeam {

	public static void main(String[] args) {

		Team T1 = new CSK();
		T1.getPlayerNum();
		T1.getPlayerName();
		T1.winLoss();

		Team T2 = new RCB();
		T2.getPlayerNum();
		T2.getPlayerName();
		T2.winLoss();
	}
}
