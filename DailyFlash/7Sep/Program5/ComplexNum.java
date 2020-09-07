


class ComplexNum {

   int real, img;

   ComplexNum(int r, int i){
	this.real = r;
	this.img = i;
   }


   public static ComplexNum sum(ComplexNum c1, ComplexNum c2) {
	
        ComplexNum temp = new ComplexNum(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;

        return temp;
    }

    public static void main(String args[]) {

    	    ComplexNum c1 = new ComplexNum(5, 3);
            ComplexNum c2 = new ComplexNum(2, 1);
            ComplexNum temp = sum(c1, c2);
        
	    System.out.println("Addition is: " + temp.real + " + " + temp.img + "i");
    }
}
