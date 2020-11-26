

class Company{

	String cmpname;

	Company(String cmpname) {

		this.cmpname = cmpname;
	}

	class Employee {

		String name, designation;
		float salary;

		Employee(String name, float salary, String designation) {

			this.name = name;
			this.salary = salary;
		        this.designation = designation;
		}

		void info() {

			System.out.println("Company Name          = " + cmpname);
			System.out.println("Employee Name         = " + name);
			System.out.println("Employee Salary       = " + salary);
			System.out.println("Employee Designation  = " + designation);
		}
	}
}

class Career {

	public static void main(String[] args){

		Company c = new Company("TCS");
		Company.Employee e = c.new Employee("XYZ",40000,"Developer");
		e.info();
	}
}
