

class TV {
	
	void turnOn(boolean tvRemote){

		if(tvRemote == true) {
			
			System.out.println("Tv is on");
		}

		else

			System.out.println("Tv is off");
		}

	void turnOn(boolean tvRemote, boolean setupBox) {

		if(tvRemote == true && setupBox == true) {

			System.out.println("Both tv and setup box is on ");
		}

		else if(tvRemote == false && setupBox == false) {

			System.out.println("Both tv and setup box is off ");

		}

		else if(tvRemote == false && setupBox == true) {

			System.out.println("Tv is off but setup box is on ");

		}

		else
			System.out.println("Setup box is off but Tv is on ");
	}


	public static void main(String[] args){

		TV obj = new TV();

		obj.turnOn(true);

		obj.turnOn(true,false);
		obj.turnOn(true,true);
		obj.turnOn(false,false);
	}
}
