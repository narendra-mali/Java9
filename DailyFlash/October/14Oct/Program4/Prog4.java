

import java.util.*;
import java.io.*;

class StringArray {

	public static void main(String[] args) {

		String arr[] = new String[3];
		
		arr[0] = "I";
		arr[1] = "Am";
		arr[2] = "Indian";

		for(int i = 1; i < 4; i++) {
		
			for(int j = 0; j < i; j++) {
			
				System.out.print(arr[i-1] + " ");
			}

			System.out.println();
		}	
	}
}
