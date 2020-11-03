

class Area {

        int side,len,breath;

        void Area(int side) {

                System.out.println("Area of Square : " + side * side);
        }

        void Area(int len,int breath) {

                System.out.println("Area of Rectangle : " + len * breath);
        }

        public static void main(String[] args) {

                Area a1 = new Area();
                a1.Area(3);

                Area a2 = new Area();
                a2.Area(2,3);
        }
}

