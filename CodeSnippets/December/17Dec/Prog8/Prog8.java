

class Core2Web  {

	void admissions() {
        	
		int managementMembers = 40;

                class Management {

			void organizeAdmission() {

				managementMembers += 1;
                                System.out.println(managementMembers);
                        }
                }

                new Management().organizeAdmission();
        }

        public static void main(String[] args) {

                new Core2Web().admissions();
        }
}

/*
 * Error
 */
