// Anonymous Inner Class 

class TripPlan {

	void place() {
	
		System.out.println("Ohh Goa");
	}
}

class Today {

	public static void main(String[] args) {
	
		TripPlan obj = new TripPlan() {
		
			void place() {
			
				System.out.println("Alibaug");
			}
		};

		obj.place();
	}
}

/*
 * Output
 *
 * Alibaug
 *
 */
