

class Chess {

	static int square = 64;
	       int pieces = 16;

	static void disSqr(){
	       
		       System.out.println("Total number of small squares on board = " + square);
	       }

	       void disPieces(){
	       
		       System.out.println("Total pieces for each player = " + pieces); 
	       }
}

class Game{

	public static void main(String[] args){
	
		Chess obj1 = new Chess();
		
		obj1.disSqr();
		obj1.disPieces();

		obj1.pieces = 7;
		obj1.disPieces();
	}
}
