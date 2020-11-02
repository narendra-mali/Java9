

class Home {

	int familyMembers;

	Home(int familyMembers) {
	
		this.familyMembers = familyMembers;
		display();
	}

	void display() {
	
		System.out.println("Number of Family Members : " + familyMembers);
	}

}

class Family {

	public static void main(String[] args) {
	
		Home h = new Home(5);
	}
}
