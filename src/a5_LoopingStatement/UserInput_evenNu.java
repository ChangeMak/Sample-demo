package a5_LoopingStatement;

import java.util.Scanner;

public class UserInput_evenNu {

	public static void main(String[] args) {
		// Print even no between 1 to 100
		int a;
		System.out.println("Enter the num");
		Scanner o=new Scanner(System.in);
	    int b=o.nextInt();
	    
	    do {
	    	if (b%2==0) {
	    		
	    	System.out.println(b);
	    	}
	    	b=b+1;
	 } while (b<=100);
	}

}
