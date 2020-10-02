


import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                Float f = Float.parseFloat(br.readLine());

                System.out.println(s + " " + f);
        }
}
