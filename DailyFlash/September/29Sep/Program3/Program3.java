


class Program3 {

        public static void main(String[] args) {

                float[] farr = {56.5f,23.2f,45.6f,102.8f,49.6f};
                float sum = 0;

                for(int i = 0; i < 5; i++) {

			sum = sum + farr[i];                  
		}

                System.out.println("Avg = " + sum / 5);
        }
}
