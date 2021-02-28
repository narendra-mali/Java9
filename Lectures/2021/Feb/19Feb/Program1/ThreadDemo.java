

class ThreadDemo {

	public static void main(String[] args) {
	
		System.out.println("MultiThreading");

		String threadName = Thread.currentThread().getName();

		System.out.println("Thread Name = " + threadName);
	}
}

/*
 * Output :-
 * MultiThreading
   Thread Name = main
 */
