

import java.util.*;

class RTO {

	public static void main(String[] args) {

		System.out.println("Enter RTO code : ");
		Scanner sc = new Scanner(System.in);
		
		String code = sc.nextLine();

		switch (code) {

			case "AP" :	
				System.out.println("State Name : Andra-Pradesh");
                		break;

            		case "MH" :
                                System.out.println("State Name : Maharashtra");
                		break;

            		case "PB" :
				System.out.println("State Name : Punjab");            			
                		break;

            		case "UP" :
                                System.out.println("State Name : Uttar Pradesh");
                		break;

			case "WB" :
                                System.out.println("State Name : West Bengal");
                                break;

            		default:
                		System.out.printf("Wrong choice");
                		break;
        	}
       }
}
