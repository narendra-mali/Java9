


import java.io.*;

class KineticEnergy {

        public static void main(String arg[]) throws IOException{

                  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                  double mass = Double.parseDouble(br.readLine());
		  double vel = Double.parseDouble(br.readLine());

		  double ke;
		  
		  ke = 0.5 * mass * vel *vel;

                  System.out.println("Kinetic Energy of that Object is: " + ke);

          }
}

