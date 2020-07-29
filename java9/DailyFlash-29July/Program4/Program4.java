

class EvenOdd {

    static int isEven(int n)
    {

        if ((n ^ 1) == n - 1)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        int n = 20;

	if(isEven(n) == 0){
		System.out.print("Even\n");
	}
	else {
		System.out.print("Odd\n");
	}
    }
}
