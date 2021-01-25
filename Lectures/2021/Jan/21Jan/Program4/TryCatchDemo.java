

class TryCatchDemo {

	public static void main(String[] args) {
	
		System.out.println("Before Exception");
		
		TryCatchDemo obj = null;

		try {
		
			obj.fun();
		}catch(NullPointerException e) {
		

		}

		System.out.println("After Exception");
	}

	void fun() {
	
		System.out.println("In fun");
	}
}

/*
 * Before Exception
 * After Exception
 */
