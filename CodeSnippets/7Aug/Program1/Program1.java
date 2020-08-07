
class Core2Web {

	public static void main(String[] args) {
	
		int var1 = 10;
		int var2 = -var1;

		int var3 = var1 * var2;
		int var4 = var1 * -var2;

		if(var3 == -var4)
			System.out.println(var3);
		else
			System.out.println(var4);
	}
}

/*     var1 = 10
 *     var2 = -10	
 *     var3 = 10 * -10 = -100
 *     var4 = 10 * -10 = -100
 */
