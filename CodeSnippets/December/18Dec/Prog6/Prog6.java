

class Core2Web {

        static class Management {

                static int managementMembers = 40;

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
 * 41
 */
