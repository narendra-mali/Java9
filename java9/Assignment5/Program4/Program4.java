

class Human {

	public static void main(String[] args) {
	
		Human lion = null;
		Human tiger = null;
		Human puma = null;
		Human monkey = new Human();

		boolean isLionHuman = lion instanceof Human;
		System.out.println("Are Lion and Human of same species = " + isLionHuman);

		boolean isTigerHuman = tiger instanceof Human;
                System.out.println("Are Tiger and Human of same species = " + isTigerHuman);

		boolean isPumaHuman = puma instanceof Human;
                System.out.println("Are Tiger and Human of same species = " + isPumaHuman);

		boolean isMonkeyHuman = monkey instanceof Human;
                System.out.println("Are Monkey and Human of same species = " + isMonkeyHuman);
	}
}

/* Explanation
 * Object of lion,tiger and puma is not created it is just a reference
 * Human lion = null               - it is called reference
 * Human monkey = new Human();     - it is called object
 * "instanceof" check whether lion,tiger,puma and monkey are of Human class if yes then it returns boolean value True/False
 * so th answer of lion,tiger and puma is False because object is not created
 */
