

import java.io.*;
import java.util.*;

class StudentInfo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Student Info : ");

                String stud = br.readLine();

		StringTokenizer st = new StringTokenizer(stud, " ");
		String token1 = (st.nextToken()).trim();
		String token2 = (st.nextToken()).trim();
		String token3 = (st.nextToken()).trim();
		String token4 = (st.nextToken()).trim();


		String name = token1;
		char grade = br.nextToken.charAt(0);
		int age = Integer.parseInt(token3);
		double marks = Double.parseDouble(token4);

                System.out.println("Student Name = " + name);
                System.out.println("Grades = " + grade);
		System.out.println("Age = " + age);
                System.out.println("Marks = " + marks);

        }
}
