

class Program5 {

	public static void main(String[] args) {
	
		int num1 = 1;
		int num2 = 4;
		int num3 = 2;

		if(num1 > num2 && num1 > num3) {
		
			System.out.println(num1 + " is Max number among " + num1 + "," + num2 + "&" + num3);
		}
		else if(num2 > num1 && num2 > num3) {
		
			 System.out.println(num2 + " is Max number among " + num1 + "," + num2 + " & " + num3);
		}
		else
			 System.out.println(num3 + " is Max number among " + num1 + "," + num2 + " & " + num3);
	}
}
