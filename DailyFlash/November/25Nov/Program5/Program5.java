

class AndroidMobile {

	static int processorchip;
	int numofcameras;

	AndroidMobile(int processorchip, int numofcameras) {

		this.processorchip = processorchip;
		this.numofcameras = numofcameras;
	}

	class Applications {

		int numofapps;
		String appstore;

		Applications(int numofapps, String appstore) {

			this.numofapps = numofapps;
			this.appstore = appstore;
		}

		void displayInfo(){

			System.out.println("Processorchip = " + processorchip);
			System.out.println("Number of cameras = " + numofcameras);
			System.out.println("Number of Applications installed = " + numofapps);
			System.out.println("Application download store = " + appstore);
		}
	}
}

class Need {

	public static void main(String[] args) {

		Need n = new Need();
		AndroidMobile a = new AndroidMobile(1,3);
		AndroidMobile.Applications ap = a.new Applications(40,"PlayStore");
		ap.displayInfo();
	}
}
