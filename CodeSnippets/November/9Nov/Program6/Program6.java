

protected class Core2Web {

        private int var1 = 10;

        public void showVar1() {

                System.out.println(var1);
        }

	public static void main(String[] args) {
	
		Core2Web c2w = new Core2Web();
		c2w.showVar1();
	}
}

/*
 * Output 
 * 
 * Program6.java:3: error: modifier protected not allowed here
 * protected class Core2Web {
 *
 */
