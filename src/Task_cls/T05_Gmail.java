package Task_cls;

import java.util.Scanner;

public class T05_Gmail {

	public static void main(String[] args) {
		// Accpet the gmail id 
		
		System.out.println("Enter the Gamil id");
        Scanner sc=new Scanner (System.in);
        String gmail =sc.nextLine();
        
        String a="@gmail.com";
        String b=gmail.substring(gmail.length()-10);
        if(a.equals(b)) {
        	System.out.println(gmail);
        }else {
        	System.out.println("Enter the correct gmail id");
        }
        
        
	}

}
