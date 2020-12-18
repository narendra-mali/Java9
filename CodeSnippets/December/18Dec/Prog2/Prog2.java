


class Core2Web {

        int managementMembers = 40;

        void admissions() {

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
 * 41
 */
