

class Player {

	void playerInfo() {
	
		System.out.println("Sachin");
	}
}

class Batsman {

	public static void main(String[] args) {
	
		Player obj = new Player() {
		
			void playerInfo() {
			
				System.out.println("Kohli");
			}
		};

		obj.playerInfo();
	}
}

/*
 * Kohli
 */
