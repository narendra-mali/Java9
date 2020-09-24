

import java.io.*;
import java.util.*;

class EmployeeInfo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Employee Info : ");

                String empDetails = br.readLine();
		
		StringTokenizer st = new StringTokenizer(empDetails, ",");
		String token1 = (st.nextToken()).trim();
		String token2 = (st.nextToken()).trim();
		String token3 = (st.nextToken()).trim();

		int empId = Integer.parseInt(token1);
		String empName = token2;
		float empSal = Float.parseFloat(token3);

                System.out.println("Emp Id = " + empId);
                System.out.println("Emp Name = " + empName);
                System.out.println("Emp Sal = " + empSal);
              
        }
}
