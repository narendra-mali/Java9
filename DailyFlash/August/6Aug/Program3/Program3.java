

class Pattern {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 10; i++) {
		
			if(i % 2 == 0) {
			
				System.out.print("B");
			}

			else {
			
				System.out.print("A");
			}
		}
	}
}

/*
 * i=1		i<=10		i%2==0		i++
 * i=1		  T		  F			A
 * 						i++
 * i=2		  T		  T			AB
 * 						i++
 * i=3		  T		  F			ABA
 *						i++
 * i=4		  T		  T			ABAB
 * 						i++
 * i=5		  T		  F			ABABA
 * 						i++
 * i=6		  T		  T			ABABAB
 * 						i++
 * i=7		  T		  F			ABABABA
 * 						i++
 * i=8		  T		  T			ABABABAB
 * 						i++
 * i=9		  T		  F			ABABABABA
 * 						i++
 * i=10		  T		  T			ABABABABAB
 * 						i++
 * i=11		  F
 * break
 * 	
 */			
