

class Core2Web {

        public static void main(String[] args) {

                int var1 = 20;
		int var2 = ++var1;
		int var3 = var2++;
		int var4 = var1--;

	 	int var5 = ++var1 + var2++ - --var2 + ++(var1++);
		System.out.println(var5);

        }
}

