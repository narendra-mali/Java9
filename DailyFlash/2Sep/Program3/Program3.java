

import java.io.*;

class Program3 {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter distance (m) = ");
                int dist = Integer.parseInt(br.readLine());
		System.out.print("Enter time (sec) = ");
                int time = Integer.parseInt(br.readLine());

     		int vel = dist / time;

		System.out.println("The Velocity of a Particle roaming in space is " + vel + "m/s");

        }
}
