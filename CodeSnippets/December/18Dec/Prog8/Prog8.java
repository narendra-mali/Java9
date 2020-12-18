

class Core2Web {

        int managementMembers = 40;

        static class Management {

                void managementDetails() {

                        managementMembers += 1;
                        System.out.println(managementMembers);
                }
        }

        public static void main(String[] args) {

                new Management().managementDetails();
        }
}

/*
 * error
 */
