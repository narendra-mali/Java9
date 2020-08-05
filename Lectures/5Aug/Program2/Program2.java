

class SwitchDemo2 {

	public static void main(String[] args) {

	int floor = 2;

	switch(floor) {

		case 1 :
			{

				char ch = 'f';
				System.out.println("First Floor");

				switch(ch) {

					case 'S' :
					case 's' :
						System.out.println("Shopping");
						break;

					case 'F' :
					case 'f' :
						System.out.println("Eating");
						break;

					default :
						System.out.println("Service Unavailable");
						break;
				}
			}
			break;

		case 2 :
			{
				char ch = 'M';
				System.out.println("Second Floor");

                                	switch(ch) {

                                        	case 'M' :
                                       	        case 'm' :
                                               		System.out.println("Movie");
                                                	break;

                                        	case 'P' :
                                        	case 'p' :
                                                	System.out.println("Play Station");
                                                	break;

                                        	default :
                                                	System.out.println("Service Unavailable");
                                                	break;
                                	}
                        }
                        break;

		default :
			System.out.println("Wrong Floor");
			break;

	}
    }
}
