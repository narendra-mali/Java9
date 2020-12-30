

class Core2Web {

	int noOfMembers;
	Core2Web() {
	
		noOfMembers = 10;
	}

	int getNoOfMembers() {
	
		return noOfMembers;
	}
}

class BiEncaps extends Core2Web {

	BiEncaps() {
	
		noOfMembers = 15;
	}

	float getNoOfMembers(int a) {
	
		return (float)noOfMembers;
	}
}

class Main {

	public static void main(String[] args) {
	
		Core2Web c2w = new BiEncaps();
		System.out.println(c2w.getNoOfMembers());
	}
}

/*
 * 15
 */
