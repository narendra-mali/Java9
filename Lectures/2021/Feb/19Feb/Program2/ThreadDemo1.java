

class ThreadDemo1 extends Thread{

	public void run() {
                
		System.out.println("In run method");

                String threadName = Thread.currentThread().getName();

                System.out.println("Thread Name = " + threadName);

	}
	public static void main(String[] args) {

      		ThreadDemo1 t = new ThreadDemo1();
		t.start();
		System.out.println("Multithreading");

               	String threadName = Thread.currentThread().getName();

               	System.out.println("Thread Name = " + threadName);
       	}
}

/*
 * Output :- 
 * Multithreading
   In run method
   Thread Name = main
   Thread Name = Thread-0
 */
