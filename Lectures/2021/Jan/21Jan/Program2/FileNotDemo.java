

import java.io.*;

class FileNotDemo {

        public static void main(String[] args) throws FileNotFoundException {

                File f = new File("Core2web.txt");
		FileInputStream fis = new FileInputStream(f);
        }
}
