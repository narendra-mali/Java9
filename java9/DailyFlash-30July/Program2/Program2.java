

import java.util.*;

class Language {

	public static void main(String[] args) {

		char x,ch;
		
		Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Character = ");
		ch = sc.next().charAt(0);;

		switch(ch) {

			case 'J' :
				System.out.println("Language: Java");
                		break;

            		case 'C' :
                                System.out.println("Language: CPP");
                		break;

            		case 'P' :
                                System.out.println("Language: Python");
                		break;

            		case 'H' :
                                System.out.println("Language: HTML");
	              		break;

			case 'O' :
    	                        System.out.println("Language: Oracle");                  
    				break;

            		default:
                		System.out.printf("Wrong choice");
                		break;
        	}
	}
}
