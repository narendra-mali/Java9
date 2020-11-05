

class Demo {

	public static void main(String[] args) { 
		
		Demo[] objarr = new Demo[10];
	
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		Demo d4 = new Demo();
                Demo d5 = new Demo();
                Demo d6 = new Demo();
		Demo d7 = new Demo();
                Demo d8 = new Demo();
                Demo d9 = new Demo();
		Demo d10 = new Demo();
		
		objarr[0] = d1;
		objarr[1] = d2;
		objarr[2] = d3;
		objarr[3] = d4;
		objarr[4] = d5;
		objarr[5] = d6;
		objarr[6] = d7;
		objarr[7] = d8;
		objarr[8] = d9;
		objarr[9] = d10;

		for(int i = 0; i < objarr.length; i++) {
		
			System.out.print(objarr[i] + " ");
		}
	}
}
