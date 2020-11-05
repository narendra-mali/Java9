
import java.util.*;

class EmployeeDetails {

	String name,add;
	int empno,contact;

	EmployeeDetails(int empno, String name, int contact,String add) {

		this.empno = empno;
		this.name = name;
		this.contact = contact;
		this.add = add;
	}

	void display() {

		System.out.println("\nEmployee number : " + empno);
		System.out.println("Employee name   : " + name);
		System.out.println("Employee contact: " + contact);
		System.out.println("Employee Address: " + add);
	}
}

class MainDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of employees : ");
		int n = sc.nextInt();
		int[] emp = new int[n];

		String name,add;
        	int contact,empno;

		for(int i = 0; i < n; i++) {

			System.out.print("\nEnter emp number : ");
			empno = sc.nextInt();
		
			System.out.print("\nEnter emp name : ");
			name = sc.nextLine();
			sc.next();

			System.out.print("\nEnter emp contact : ");
			contact = sc.nextInt();
		
			System.out.print("\nEnter emp add : ");
			add = sc.nextLine();
	
			EmployeeDetails e = new EmployeeDetails(empno,name,contact,add);
			e.display();
		}	
	}
}
