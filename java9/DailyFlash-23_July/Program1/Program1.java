

class EvenOdd {

	int evenOdd(int n) {
	
		return n;
	}

	public static void main(String[] args) {
	
		EvenOdd obj1 = new EvenOdd();

		int n = 10;

		if(obj1.evenOdd(n) % 2 == 0){
		
			System.out.println(n + " is Even Number");
		}

		else{
		
			System.out.println(n + " is Odd Number");
		}

		n = 9;
		if(obj1.evenOdd(n) % 2 == 0){
		
			System.out.println(n + " is Even Number");
		}

		else{

                        System.out.println(n + " is Odd Number");
                }

	}
}
