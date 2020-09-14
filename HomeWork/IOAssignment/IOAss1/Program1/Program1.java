

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program1 {
 
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  		System.out.println("Enter String :");
  		String str = br.readLine();
  
		System.out.println("Enter Integer :");
  		int n = Integer.parseInt(br.readLine());
  
		System.out.println("Enter Character:");
 		char ch = br.readLine().charAt(0);

		System.out.println("Enter float number :");
  		float ft = Float.parseFloat(br.readLine());
          
		System.out.println("Enter short number :");
  		short st = Short.parseShort(br.readLine());
  
		System.out.println("Enter Double number :");
  		double dl = Double.parseDouble(br.readLine());
  
		System.out.println("Enter Long number :");
  		long lg = Long.parseLong(br.readLine());
  
		System.out.println("Entered Values are :");
                System.out.println("String = " + str);
		System.out.println("Integer = " + n);
		System.out.println("Character = " + ch);
  		System.out.println("Float = " + ft);
  		System.out.println("Short = " + st);
  		System.out.println("Double = " + dl);
  		System.out.println("Long = " + lg);
	}

}
