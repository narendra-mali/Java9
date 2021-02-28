
// Compiletime Exception
/*
import java.io.*;

class ThrowDemo2 {

	static IOException io = new IOException();

	public static void main(String[] args) throws IOException {
	
		throw io;
	}
}

*/

import java.io.*;

class ThrowDemo2 {

        static IOException io = new IOException();

        public static void main(String[] args) {

		try {
		
			throw io;
		}catch(IOException obj) {
		
			System.out.println(obj);
		}
        }
}

/*
 * Output :-
 * java.io.IOException
 */
