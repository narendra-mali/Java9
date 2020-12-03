

import java.io.*;

class Core2Web {

        public static void main(String[] args) {

		Core2Web obj = new Core2Web();
		obj.getName();
	}

	void getName() throws IOException {

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                br.skip(2);

                String name = br.readLine();

                System.out.println(name);

        }
}

