

class Program22 {

    public static void main(String[] args) {

        char ch = 'a';

        switch (ch) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

            
		    System.out.println(ch + " is vowel");
                    break;
            
	    default:
                System.out.println(ch + " is consonant");
        }
    }
}
