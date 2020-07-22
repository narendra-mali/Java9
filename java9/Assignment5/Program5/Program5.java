

class Flat {

	public static void main(String[] args) {
	
		Flat coronaPatients = null;
		Flat NOcoronaPatients = null;
		Flat quarantinePatients = new Flat();

		boolean male = coronaPatients instanceof Flat;
		System.out.println("Male Corona Patients in Building = " + male);

		boolean teenAge = NOcoronaPatients instanceof Flat;
                System.out.println("Teenage Corona Patients in Building = " + teenAge);

		boolean oldAge = quarantinePatients instanceof Flat;
                System.out.println("Old Age Corona Patients in Building = " + oldAge);

	}
}
