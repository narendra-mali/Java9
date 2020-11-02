

class Student {

	int rollNo = 5;
	String name = "XYZ";
	double avg = 75.76;
	char grade = 'B';

	Student() {
	
		System.out.println("Student Roll No : " + rollNo);
		System.out.println("Student Name : " + name);
		System.out.println("Average Marks : " + avg);
	        System.out.println("Grade : " + grade);	
	}
}

class Info {

	public static void main(String[] args) {
	
		Student s = new Student();
	}
}
