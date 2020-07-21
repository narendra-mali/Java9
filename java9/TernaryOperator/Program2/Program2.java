

class Football {


}

class Cricket {

        public static void main(String[] args) {

                Cricket obj = new Cricket();
	//	System.out.println(Cricket instanceof Object);  // error
		System.out.println(obj instanceof Object);      // true

		Cricket t20 = new Cricket();
	//	Cricket t20 = new null				// reference
        
	        Cricket test = new Cricket();
		Football fmatch = new Football();	
	  
		System.out.println(t20 instanceof Object);	// true
       //	System.out.println(Football instanceof Object); // error

		System.out.println(fmatch instanceof Football); // true
		System.out.println(fmatch instanceof Object);   // true

        }
}

