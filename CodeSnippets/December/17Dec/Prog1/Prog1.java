

class Core2Web  {

	class BiEncaps {
	
		void fun() {
		
			System.out.println(this);
		}
	}

	public static void main(String[] args) {
	
		new BiEncaps().fun();
	}
}

/*
 * Compile time error
 */
