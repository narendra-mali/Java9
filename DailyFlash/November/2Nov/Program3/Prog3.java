

class Student {

	String name = "ABC";
	int rollNo = 10;

	Student() {
	
		System.out.println("In Student Constructor");
		System.out.println("Student name : " + name);
                System.out.println("Student Roll No : " + rollNo);
	}
}

class College extends Student {

	College() {
	
		System.out.println("\nIn College Constructor");
		System.out.println("Student name : " + name);
		System.out.println("Student Roll No : " + rollNo);
	}

	College(String name,int rollNo) {
	
		this.rollNo = rollNo;
		this.name = name;
		
		System.out.println("\nIn College Parameterized Constructor");
		System.out.println("Student name : " + name);
		System.out.println("Student Roll No : " + rollNo);
	}
	
	College(Student obj) {
	
		System.out.println("\nIn College Constructor2");
                System.out.println("Student name : " + obj.name);
                System.out.println("Student Roll No : " + obj.rollNo);
	}
}

class Display {

	public static void main(String[] args) {
	
		Student s1 = new Student();
		College c1 = new College("XYZ",20);
		
		Student s2 = new Student();
		College c2 = new College(s2);
	}
}
