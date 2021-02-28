

class MyException extends Exception {

	String msg = null;

	MyException(String str) {
	
		msg = str;
	}
	public String toString() {
	
		return msg;
	}
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println("In Try");
			throw new MyException("Customized Exception");
		}catch(MyException me) {
			
			System.out.println("In Catch");
			System.out.println(me.toString());
		}
	}
}

/*
 * Output :-
 * In Try
   In Catch
   Customized Exception
 */
