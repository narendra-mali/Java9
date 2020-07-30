


class SwitchDemo {

        public static void main(String[] args) {

                String x = "Core2Web";
	//	String x = new String("Core2Web");
	
	        switch(x) {

                        case "Core2Web" :
                                System.out.println("Camel sase");
                                break;

                        case "core2web" :
                                System.out.println("Small case");
                                break;
                }

		 String y = "core2web";

 		 switch(y) {

                        case "Core2Web" :
                                System.out.println("Camel sase");
                                break;

                        case "core2web" :
                                System.out.println("Small case");
                                break;
                }

	/*	 StringBuffer z = new StringBuffer("core2web");
 
                 switch(z) {						// error

                        case "Core2Web" :
                                System.out.println("Camel sase");
                                break;

                        case "core2web" :
                                System.out.println("Small case");
                                break;
                }*/

	/*	 boolean x = true;

                 switch(x) {

                        case "Core2Web" :
                                System.out.println("Camel sase");
                                break;

                        case "core2web" :
                                System.out.println("Small case");
                                break;
                } */


	}
}

