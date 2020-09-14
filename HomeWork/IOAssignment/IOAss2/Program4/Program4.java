

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program4 {

        public static void main(String[] args) throws IOException {

		int sq = 1,cube = 1;
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter starting number : ");
		int n1 = Integer.parseInt(br.readLine());

		System.out.print("Enter ending number : ");
                int n2 = Integer.parseInt(br.readLine());

		System.out.print("Square = ");
		for(int i = n1; i <= n2; i++) {
		
			System.out.print(i * i + " ");
		}

		System.out.print("\nCube = " + " ");
                for(int i = n1; i <= n2; i++) {

                        System.out.print(i * i * i + " ");
                }

	}
}

