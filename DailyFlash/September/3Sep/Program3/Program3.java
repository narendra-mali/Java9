


import java.io.*;

class Program3 {

        public static void main(String arg[]) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("I = ");
		int i = Integer.parseInt(br.readLine());
		System.out.print("R = ");
		int r = Integer.parseInt(br.readLine());

		int v = i * r;
		System.out.println("Voltage V = " + v);
		
	}
}
