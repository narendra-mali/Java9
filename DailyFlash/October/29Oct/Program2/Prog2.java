
import java.io.*;

class MarutiSuzuki {

	void engine () {
		
		System.out.println("In MarutiSuzuki Class");
	}
}

class Maruti extends MarutiSuzuki {

	void engine() {
		
		System.out.println("In Maruti Class");
	}
}

class Suzuki extends MarutiSuzuki {

	void engine () {
		
		System.out.println("In Suzuki Class");
	}
}

class MainClass {

	public static void main(String[] args) {

		MarutiSuzuki m = new MarutiSuzuki();
		m.engine();

		Maruti m1 = new Maruti();
		m1.engine();

		Suzuki s = new Suzuki();
		s.engine();

		MarutiSuzuki m2 = new Maruti();
		m2.engine();

		MarutiSuzuki s1 = new Suzuki();
		s1.engine();
	}
}
