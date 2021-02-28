

import java.io.*;

class ThrowDemo3 {

        static IOException io = new IOException("Our Exception");

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
 * java.io.IOException: Our Exception
 */
