

class Core2Web {

        int managementMembers = 40;

        static class Management {

                void managementDetails() {

                       System.out.println(new Core2Web().managementMembers);
                }
        }

        public static void main(String[] args) {

                new Core2Web().fun();
        }

	void fun() {
	
		new Management().managementDetails();
	}
}

/*
 * 40
 */
