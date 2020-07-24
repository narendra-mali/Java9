


class  Attendance {

	boolean isEligible(int n) {
	
		if(n > 75)
			return true;
		
		else
			return false;
	}

	public static void main(String args[]) {

		Attendance stud  = new Attendance();
		int n = 58;

			System.out.println("Student's attendance is " + n + "%");
		
		if(stud.isEligible(n) == true){
		
			 System.out.println("Student is Eligible for the Exam");
		}
		
		else {

			System.out.println("Student is not Eligible for Exam");
		}
	}
}
