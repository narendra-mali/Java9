

class Addition {

	void add(float ... varg) {
	
		System.out.println("Addition of var args");
	}

	void add(float x,float y) {
	
		System.out.println("Addition of float variables");
	}
}

class Solution {

	public static void main(String[] args) {
	
		Addition obj = new Addition();
		
		obj.add();
		obj.add(8.9f);
		obj.add(5.5f,10.5f);
		obj.add(12.2f,4.2f);
	}
}
