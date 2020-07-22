

class Instagram {

	static void post(Instagram obj) {
		
		String res = null;	
		res = (obj instanceof Instagram) ? "Instance of class" : "not instance of class";
		System.out.println(res);
	}

	       void followers(){
	       
		       System.out.println("Followers");
	       } 
}

class Facebook{

	public static void main(String[] args) {
	
		Instagram obj1 = new Instagram();
		Instagram.post(obj1);

		obj1.followers();

	}
}
