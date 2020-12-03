

import java.io.*;

class Core2Web {

        public static void main(String[] args) throws IOException {

                Core2Web obj = new Core2Web();
                obj.getSalary();
        }

        void getSalary() throws IOException {

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                double salary = Double.parseDouble(br.readLine());
                System.out.println(salary);

        }
}
