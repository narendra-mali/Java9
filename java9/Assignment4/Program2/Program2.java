

class Program2{

	public static void main(String[] args) {
	int num1 = 10;
	int num2 = 5;

	System.out.println("Answer : " + ((num1++ | num2) & ((++num2)^num1)));

	}
}
