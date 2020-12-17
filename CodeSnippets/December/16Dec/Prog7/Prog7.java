

class Parent {

        int var1 = 10;
        String var2 = "Core2Web";
	Parent(int var1, String var2) {
	
		this.var1 = var1;
		this.var2 = var2;
	}
}

class Child extends Parent {

	Child(int var1, String var2) {
	
		super(var1,var2);
	}

        public static void main(String[] args) {

		Child obj = new Child(10,"Predator");
                obj.var1 = obj.var1+1;
                System.out.println(obj.var1);
        }
}

/*
 * 11
 */
