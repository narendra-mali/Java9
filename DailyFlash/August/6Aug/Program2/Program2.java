

class Students {

	public static void main(String[] args) {
	
		int year = 3,marks = 80;

		switch(year) {
		
			case 1 :
				 System.out.println("Student is not eligible for education Scholarship");
				 break;

			case 2 :
				System.out.println("Student is not eligible for education Scholarship");
				break;

			case 3 :
				{
				
					switch(marks) {
					
						case 60 :
							System.out.println("Student is not eligible for education Scholarship");
                                			break;

						case 70 :
							System.out.println("Student is not eligible for education Scholarship");
                                			break;

						case 80 :
                                                        System.out.println("Student eligible for education Scholarship");
                                                        break;

						case 90 :
                                                        System.out.println("Student eligible for education Scholarship");
                                                        break;

						case 100 :
                                                        System.out.println("Student eligible for education Scholarship");
                                                        break;

					}
				}
				break;
		}		
	}
}
