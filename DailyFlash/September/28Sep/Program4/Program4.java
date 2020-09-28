


import java.io.*;

class Program4 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Length of side : ");
                int side = Integer.parseInt(br.readLine());

		int area = side * side;
                System.out.println("Area : " + area);
              
		int peri = 4 * side;
                System.out.println("Perimeter : " + peri);
        }
}
