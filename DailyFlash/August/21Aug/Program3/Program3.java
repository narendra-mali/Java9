

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program3 {

	public static void main(String[] args) throws IOException {

		int age;
		char sex,m;

       		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
		System.out.println("Enter Age = ");
                age = Integer.parseInt(br.readLine());
	
		System.out.println("Enter sex = ");
                sex = (char)br.read();

		System.out.println("Enter Maratial Status = ");
                m = (char)br.read();

		if(sex == 'F') {
			
			System.out.println("Employee will work only in Urban areas");
		}

		if(sex == 'M') {
		       
			if((age >= 20) && (age < 40)) {
		       		
				System.out.println("Employee may work anywhere");
			}
			
			else if((age >= 40) && (age < 60)) {
				
				System.out.println("Employee will work in urban areas only ");
			}
			
			else
				 System.out.println("Error");
		}
	}
}

