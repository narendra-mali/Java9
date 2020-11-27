

class University {

}

class College {

}

class Student {

	void study(University sppu) {
	
		System.out.println("Study of University");
	}

	void study(College jspm) {
	
		System.out.println("Study of JSPM College");
	}
}

class Demo {

	public static void main(String[] args) {
	
		Student obj = new Student();
		
		obj.study(new University());
		obj.study(new College());
	}
}
