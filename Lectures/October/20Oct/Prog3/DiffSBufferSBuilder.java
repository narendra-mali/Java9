
import java.util.GregorianCalendar;

class Difference {

	public static void main(String[] args) {
	
		long startTime = new GregorianCalendar().getTimeInMillis();
		long startMemory = Runtime.getRuntime().freeMemory();

		//StringBuffer sb = new StringBuffer("Shashi");
		StringBuilder sb = new StringBuilder("Shashi");

		for(int i = 1; i < 10000000; i++) {
		
			sb.append("Hello");
		}

		 long endTime = new GregorianCalendar().getTimeInMillis();
		 long endMemory = Runtime.getRuntime().freeMemory();

		 System.out.println("Time = " + (endTime - startTime));
		 System.out.println("Time = " + (endMemory - startMemory));
	}
}
