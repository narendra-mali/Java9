
import java.util.*;

class StringToggle {

        public static void main(String[] args) {

                int n,i;
                String str1;

                Scanner sc = new Scanner (System.in);
                System.out.println("Enter the String : ");
                str1 = sc.nextLine();

                System.out.println("Enter the index of string : ");
                n = sc.nextInt();

                char str[] = str1.toCharArray();

                if(str[n] >= 'A' && str[n] <= 'Z')
                        str[n] = (char)((int)str[n]+32);
                
		else if (str[n] >= 'a' && str[n] <= 'z')
                        str[n] = (char)((int)str[n]-32);

                System.out.println("String after toggle ");
                
		for(i = 0; i < str.length; i++){
                        
			System.out.print(str[i]);
                }
        }
}
