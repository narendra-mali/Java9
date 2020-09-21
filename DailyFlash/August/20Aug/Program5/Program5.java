

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Program5 {

	public static void main(String[] args) throws IOException {
        
		int phy,chem,bio,maths,comp;
		float total,per;
       		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
                System.out.println("Enter 5 Subjects Marks :");
                phy = Integer.parseInt(br.readLine());
		chem = Integer.parseInt(br.readLine());
             	bio = Integer.parseInt(br.readLine());
		maths = Integer.parseInt(br.readLine());
		comp = Integer.parseInt(br.readLine());
                
		total = phy + chem + bio + maths + comp;
	        per = (total / 500) * 100;
		
		System.out.println("Percentage =  " + per);
		
		if(per >= 90) 
			System.out.println("\n Grade A");
		
		else if(per >= 80)
			System.out.println("\n Grade B");
		
		else if(per >= 70)
			System.out.println("\n Grade C");
		
		else if(per >= 60)
			System.out.println("\n Grade D");
		
		else if(per >= 40)
			System.out.println("\n Grade E");
		
		else 
			System.out.println("\n Fail");
		
	}
}

