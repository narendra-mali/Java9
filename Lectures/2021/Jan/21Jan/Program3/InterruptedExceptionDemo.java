

class InterruptedExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
	
		Thread t = new Thread();
		t.start();

		System.out.println("Core2Web");
		t.sleep(5000);
		System.out.println("Biencaps");
	}
}

/*
 * Core2Web
 * Biencaps
 */
