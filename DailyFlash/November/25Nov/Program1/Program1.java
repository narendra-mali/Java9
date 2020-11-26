

class Hostel {

	int hostelid;

	Hostel(int hostelid) {

		this.hostelid = hostelid;
	}

	class Student {

		int studentid;
		int hostelid;

		Student(int studentid, int hostelid) {

			this.studentid = studentid;
			this.hostelid = hostelid;
		}

		Hostel h = new Hostel(10);
		
		void checkHostelid() {

			if(h.hostelid == hostelid)
				
				System.out.println("Student is allowed");

			else
				System.out.println("Student is not allowed");

		}
	}

	public static void main(String[] args){

		Hostel h = new Hostel(10);
		Student s1 = h.new Student(30,10);
		Student s2 = h.new Student(70,80);

		s1.checkHostelid();
		s2.checkHostelid();
	}
}
