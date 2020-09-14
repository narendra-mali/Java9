


class Program9 {

	public static void main(String args[]){

		int rem,sum = 0,temp;
  		int num = 121;

  		temp = num;

		while(num > 0) {

			rem = num % 10;
   			sum = (sum * 10) + rem;
   			num = num / 10;
  		}

		if(temp == sum)

			System.out.println(temp + " is Palindrome number ");
  		else

			System.out.println(temp + " is not Palindrome number");
	}
}
