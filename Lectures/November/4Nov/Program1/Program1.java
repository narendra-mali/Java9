

class IndianDefence {

	IndianDefence() {
	
		System.out.println("Major General Bipin Rawat");
	}

	class Army {
	
		void attack() {
		
			System.out.println("Uri Attack");
		}
	}

	class Navy {
	
		void attack() {
		
			System.out.println("Gazi Attack");
		}
	}

	class AirForce {
	
		void attack() {

                        System.out.println("Balakot Attack");
                }
	}

	public static void main(String[] args) {
	
		IndianDefence obj = new IndianDefence();
		
		IndianDefence.Army a1 = obj.new Army();
		a1.attack();

		Navy n1 = obj.new Navy();
		n1.attack();

		IndianDefence.AirForce a2 = obj.new AirForce();
		a2.attack();
	}
}
