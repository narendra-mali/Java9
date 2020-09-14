

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program3 {

        public static void main(String[] args) throws IOException {

		int i=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter character : ");
             
		char ch = (char)br.read();
	
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
			System.out.println(ch + " is Vowel");
		}
		else
			 System.out.println(ch + " is Consonant");
	}
}	
		
