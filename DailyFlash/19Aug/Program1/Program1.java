

class Program1 {

	public static void main(String[] args) {
	
		char ch = 'v';

		if (ch >= 'A' && ch <= 'Z')
            
			System.out.println("Letter " + ch + " is in UpperCase character");

        	else if (ch >= 'a' && ch <= 'z')
            
			System.out.println("Letter " + ch +" is in LowerCase character" );
		else
			
			System.out.println(ch + " is not a character");
	}
}
