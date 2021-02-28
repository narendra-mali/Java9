

class ThreadDemo extends Thread {

	public void run() {
	
		System.out.println(Thread.currentThread().getName());

		for(int i = 0; i < 10; i++) {
		
			System.out.println("Core2Web");
		}
	}
}

class MultithreadingDemo {

	public static void main(String[] args) {
	
		ThreadDemo t = new ThreadDemo();
		t.start();

		System.out.println(Thread.currentThread().getName());

                for(int i = 0; i < 10; i++) {

                        System.out.println("Biencaps");
                }
	}
}
