
// Is it possible to overload the main method ?
// Yes it is possible


class OverloadMain {
	
	public static void main(Integer args) {
		
		System.out.println("Integer Main Method");
    	}
	
	public static void main(char args) {
		
		System.out.println("Char Main Method");
	}

   	public static void main(String[] args) {
    
		System.out.println("Original Main() Method");
    	}
}
